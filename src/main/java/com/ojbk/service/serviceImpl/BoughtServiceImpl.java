package com.ojbk.service.serviceImpl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ojbk.entity.Bought;
import com.ojbk.entity.Coupon;
import com.ojbk.entity.User;
import com.ojbk.entity.V2Order;
import com.ojbk.mappers.BoughtMapper;
import com.ojbk.mappers.CouponMapper;
import com.ojbk.mappers.UserMapper;
import com.ojbk.service.BoughtService;
import com.ojbk.service.V2OrderService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.*;
import java.util.stream.Collectors;

@Service
public class BoughtServiceImpl extends ServiceImpl<BoughtMapper, Bought> implements BoughtService{

    @Resource
    private BoughtMapper boughtMapper;
    @Resource
    private UserMapper userMapper;
    @Resource
    private CouponMapper couponMapper;
    @Resource
    private V2OrderService v2OrderService;

    @Override
    public int updateBatch(List<Bought> list) {
        return baseMapper.updateBatch(list);
    }
    @Override
    public int updateBatchSelective(List<Bought> list) {
        return baseMapper.updateBatchSelective(list);
    }
    @Override
    public int batchInsert(List<Bought> list) {
        return baseMapper.batchInsert(list);
    }
    @Override
    public int insertOrUpdate(Bought record) {
        return baseMapper.insertOrUpdate(record);
    }
    @Override
    public int insertOrUpdateSelective(Bought record) {
        return baseMapper.insertOrUpdateSelective(record);
    }

    @Override
    public int ConversionBoughtTable() {
        //清空v2_order表
        deleteV2boardOrderTable();
        int count = 0;
        //数组序号
        int i = 0;
        QueryWrapper<Bought> queryWrapper = new QueryWrapper<>();
        List<Bought> boughtList = boughtMapper.selectList(queryWrapper);
        //购买记录数量
        Integer selectCount = 0;
        if (boughtList.size() > 0){
            selectCount = (int)boughtList.stream().count();
        }

        //查询coupon优惠码表
        QueryWrapper<Coupon> queryWrapper1 = new QueryWrapper<>();
        List<Coupon> couponList = couponMapper.selectList(queryWrapper1);

        //查询用户表
        QueryWrapper<User> queryWrapper2 = new QueryWrapper<>();
        List<User> userList = userMapper.selectList(queryWrapper2);

        //生成19位随机单号
        String[] randomStringArray = getRandomStringArray(19, selectCount * 2);
        //转换对象集合
        List<V2Order> v2OrderList = new ArrayList<>();
        for (Bought bought : boughtList){
            V2Order v2Order = new V2Order();
            v2Order.setId(bought.getId().intValue());
            List<User> collect = userList.stream().filter(user1 -> user1.getId().equals(bought.getUserid())).collect(Collectors.toList());
            //获取当前订单用户
            User user = null;
            if (collect.size() > 0){
                user = collect.stream().findAny().get();
            }
            if (user != null) {
                //获取当前订单的邀请用户id
                Integer refBy = user.getRefBy();
                //设置邀请用户id
                if (refBy != null && refBy != 0) {
                    v2Order.setInviteUserId(refBy);
                } else {
                    v2Order.setInviteUserId(null);
                }
            }
            v2Order.setUserId(bought.getUserid().intValue());
            Integer shopId = bought.getShopid().intValue();
            Integer plainId = null;
            //筛选原用户套餐
            if (shopId != null) {
                switch (shopId) {
                    case 1:
                        plainId = 2;
                        break;
                    case 2:
                        plainId = 5;
                        break;
                    case 3:
                        plainId = 9;
                        break;
                    case 4:
                        plainId = 1;
                        break;
                    case 5:
                        plainId = 4;
                        break;
                    case 6:
                        plainId = 8;
                        break;
                    case 7:
                        plainId = 6;
                        break;
                    case 8:
                        plainId = 7;
                        break;
                    case 9:
                        plainId = 10;
                        break;
                    default:
                        plainId = null;

                }
            }
            //设置套餐
            v2Order.setPlanId(plainId);
            List<Coupon> endCouponList = couponList.stream().filter(coupon1 -> coupon1.getCode().equals(bought.getCoupon())).collect(Collectors.toList());
            if (endCouponList.size() == 1){
                for (Coupon coupon1 : couponList){
                    v2Order.setCouponId(coupon1.getId().intValue());
                }
            }else if (couponList.size() > 1){
                Coupon coupon1 = couponList.stream().max(Comparator.comparingLong(Coupon::getExpire)).get();
                v2Order.setCouponId(coupon1.getId().intValue());
                //throw new Exception("查询到重复优惠码！");
            }
            //设置默认支付方式为当面付
            v2Order.setPaymentId(1);
            //设置购买类型为新购
            v2Order.setType(1);
            String cycle = null;
            //设置续费周期
            switch (shopId){
                case 5:
                case 7:
                    cycle = "quarter_price";
                    break;
                default:
                    cycle = "month_price";
            }
            v2Order.setCycle(cycle);
            v2Order.setTradeNo(randomStringArray[i]);
            i+=1;
            v2Order.setCallbackNo(randomStringArray[i]);
            //存在瑕疵的部分开始
            //设置总价
            v2Order.setTotalAmount(bought.getPrice().intValue()*100);
            //折扣价
            v2Order.setDiscountAmount(null);
            //剩余价值
            v2Order.setSurplusAmount(null);
            //退款金额
            v2Order.setRefundAmount(null);
            //使用余额
            v2Order.setBalanceAmount(null);
            //折抵订单
            v2Order.setSurplusOrderIds(null);
            //设置状态为已完成
            v2Order.setStatus(3);
            v2Order.setCommissionStatus(0);
            v2Order.setCommissionBalance(0);
            //支付时间
            v2Order.setPaidAt(bought.getDatetime());
            //创建时间
            v2Order.setCreatedAt(bought.getDatetime());
            //修改时间
            v2Order.setUpdatedAt(bought.getDatetime());
            //添加到转换对象集合
            v2OrderList.add(v2Order);
            //数组序号加1
            i++;
            count++;
        }
        //批量插入v2_order表
        insertV2boardOrderTable(v2OrderList);
        return count;
    }

    public static String[] getRandomStringArray(int length,int size){
        String[] strArray = new String[size];
        char[] chars = "0123456789".toCharArray();
        Random random = new Random();
        StringBuffer sb = new StringBuffer();
        HashSet<String> set = new HashSet<>();
        while (set.size() < size){//生成随机字符串到set里面
            sb.setLength(0);
            for (int i = 0; i < length; i++)
                sb.append(chars[random.nextInt(10)]);
            set.add(sb.toString());
        }
        int i= 0;
        for (String s : set)//将set里面的数据存放到数组
            strArray[i++] = s;
        return strArray;
    }

    public void deleteV2boardOrderTable(){
        v2OrderService.delete();
    }

    public void insertV2boardOrderTable(List<V2Order> v2OrderList){
        v2OrderService.batchInsert(v2OrderList);
    }
}
