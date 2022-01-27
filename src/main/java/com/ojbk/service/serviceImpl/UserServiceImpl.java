package com.ojbk.service.serviceImpl;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.ojbk.entity.Bought;
import com.ojbk.entity.V2User;
import com.ojbk.mappers.BoughtMapper;
import com.ojbk.mappers.V2UserMapper;
import com.ojbk.service.V2UserService;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.stream.Collectors;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ojbk.mappers.UserMapper;
import com.ojbk.entity.User;
import com.ojbk.service.UserService;
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService{

    @Resource
    private UserMapper userMapper;
    @Resource
    private BoughtMapper boughtMapper;
    @Resource
    private V2UserService v2UserService;

    @Override
    public int updateBatch(List<User> list) {
        return baseMapper.updateBatch(list);
    }
    @Override
    public int updateBatchSelective(List<User> list) {
        return baseMapper.updateBatchSelective(list);
    }
    @Override
    public int batchInsert(List<User> list) {
        return baseMapper.batchInsert(list);
    }
    @Override
    public int insertOrUpdate(User record) {
        return baseMapper.insertOrUpdate(record);
    }
    @Override
    public int insertOrUpdateSelective(User record) {
        return baseMapper.insertOrUpdateSelective(record);
    }

    @Override
    public int ConversionUserTable() {
        //开始执行首先清空v2_user表
        deleteV2boardUserTable();
        //查询所有用户
        List<User> userList = userMapper.queryAllUser();
        Integer renShu = null;
        if (userList.size() > 0){
            //user表记录数
            renShu = (int)userList.stream().count();
        }
        System.out.println("待转换人数："+renShu);
        int count = 0;
        //数组序号
        int i = 0;
        //生成随机toekn数组
        String[] randomStringArray = getRandomStringArray(32,renShu);
        //查询所有用户购买记录
        QueryWrapper<Bought> queryWrapper = new QueryWrapper<>();
        List<Bought> boughtList = boughtMapper.selectList(queryWrapper);
        //新表user对象集合
        List<V2User> v2UserList = new ArrayList<>();
        for (User user:userList){
            try {
                V2User v2User = new V2User();
                //设置用户id
                v2User.setId(user.getId());
                //设置用户money
                v2User.setBalance(user.getMoney().multiply(new BigDecimal("100")).intValue());
                //获取邀请用户id
                v2User.setInviteUserId(user.getRefBy());
                v2User.setTelegramId(user.getTelegramId());
                v2User.setEmail(user.getEmail());
                //获取登陆密码
                v2User.setPassword(user.getPass());
                //设置默认加密方式为sha256
                v2User.setPasswordAlgo("sha256");
                v2User.setCommissionType(0);
                v2User.setCommissionBalance(0);
                v2User.setT(user.getT());
                v2User.setU(user.getU());
                v2User.setD(user.getD());
                v2User.setTransferEnable(user.getTransferEnable());
                v2User.setBanned(0);
                v2User.setIsAdmin(user.getIsAdmin());
                v2User.setIsStaff(0);
                v2User.setUuid(user.getUuid());
                //设置用户等级
                Integer class2 = user.getClass2();
                switch (class2) {
                    case 9:
                        v2User.setGroupId(1);
                        break;
                    case 11:
                        v2User.setGroupId(2);
                        break;
                    case 21:
                        v2User.setGroupId(3);
                        break;
                    case 31:
                        v2User.setGroupId(4);
                        break;
                    default:
                        v2User.setGroupId(null);
                }
                //设置用户套餐
                //查询用户购买的套餐
                List<Bought> collect = boughtList.stream().filter(bought -> bought.getUserid().equals(user.getId())).collect(Collectors.toList());
                Bought userBought = null;
                if (collect.size() >0){
                    userBought = collect.stream().max(Comparator.comparingLong(Bought::getDatetime)).get();
                }
                if (userBought != null) {
                    Integer plainId = null;
                    Integer shopId = userBought.getShopid().intValue();
                    //筛选原用户套餐
                    if (v2User.getGroupId() != null) {
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
                    //设置用户套餐id
                    v2User.setPlanId(plainId);
                }else {
                    //设置用户套餐为null
                    v2User.setPlanId(null);
                }
                v2User.setRemindExpire(0);
                v2User.setRemindTraffic(0);
                //设置token
                System.out.println("用户随机token为："+randomStringArray[i]);
                v2User.setToken(randomStringArray[i]);
                //设置套餐过期时间
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                Date classExpireDate = simpleDateFormat.parse(simpleDateFormat.format(user.getClassExpire()));
                long classExpireTime = classExpireDate.getTime()/1000;
                v2User.setExpiredAt(classExpireTime);

                Date regDate2 = simpleDateFormat.parse(simpleDateFormat.format(user.getRegDate()));
                long regDateTime = regDate2.getTime()/1000;
                //设置创建时间
                v2User.setCreatedAt(regDateTime);
                //设置修改时间
                v2User.setUpdatedAt(regDateTime);
                //添加到转换对象集合
                v2UserList.add(v2User);
            }catch (Exception e){
                e.printStackTrace();
                System.out.println("user表转换失败！");
            }
            //统计转换数
            count++;
            //token数组序号加1;
            i++;
        }
        //批量插入新的v2_user表
        insertV2boardUserTable(v2UserList);
        return count;
    }

    public static String[] getRandomStringArray(int length,int size){
        String[] strs = new String[size];
        char[] chars = "abcdefghijklmnopqrstuvwxyz0123456789".toCharArray();
        Random random = new Random();
        StringBuffer sb = new StringBuffer();
        HashSet<String> set = new HashSet<>();
        while (set.size() < size){//生成随机字符串到set里面
            sb.setLength(0);
            for (int i = 0; i < length; i++)
                sb.append(chars[random.nextInt(36)]);
            set.add(sb.toString());
        }
        int i= 0;
        for (String s : set)//将set里面的数据存放到数组
            strs[i++] = s;
        return strs;
    }

    public void deleteV2boardUserTable(){
        v2UserService.truncateTable();
    }

    public void insertV2boardUserTable(List<V2User> v2UserList){
        v2UserService.batchInsert(v2UserList);
    }
}
