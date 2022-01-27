package com.ojbk.service.serviceImpl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.ojbk.entity.V2Coupon;
import com.ojbk.mappers.V2CouponMapper;
import com.ojbk.service.V2CouponService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ojbk.entity.Coupon;
import com.ojbk.mappers.CouponMapper;
import com.ojbk.service.CouponService;

import javax.annotation.Resource;

@Service
public class CouponServiceImpl extends ServiceImpl<CouponMapper, Coupon> implements CouponService{

    @Resource
    private CouponMapper couponMapper;
    @Resource
    private V2CouponService v2CouponService;

    @Override
    public int updateBatch(List<Coupon> list) {
        return baseMapper.updateBatch(list);
    }
    @Override
    public int updateBatchSelective(List<Coupon> list) {
        return baseMapper.updateBatchSelective(list);
    }
    @Override
    public int batchInsert(List<Coupon> list) {
        return baseMapper.batchInsert(list);
    }
    @Override
    public int insertOrUpdate(Coupon record) {
        return baseMapper.insertOrUpdate(record);
    }
    @Override
    public int insertOrUpdateSelective(Coupon record) {
        return baseMapper.insertOrUpdateSelective(record);
    }

    @Override
    public int ConversionCouponTable() {
        //清空v2_coupon表
        deleteV2boardCouponTable();
        int count = 0;
        V2Coupon v2Coupon = new V2Coupon();
        QueryWrapper<Coupon> queryWrapper = new QueryWrapper<>();
        List<Coupon> couponList = couponMapper.selectList(queryWrapper);
        //转换对象集合
        List<V2Coupon> v2CouponList = new ArrayList<>();
        for (Coupon coupon : couponList){
            v2Coupon.setId(coupon.getId().intValue());
            v2Coupon.setCode(coupon.getCode());
            //设置name默认值
            v2Coupon.setName("迁移优惠码");
            //设置迁移数据为按比例优惠
            v2Coupon.setType(2);
            Integer credit = coupon.getCredit();
            //设置优惠比例
            v2Coupon.setValue(credit.intValue());
            //设置最大使用次数为不限制
            v2Coupon.setLimitUse(null);
            //每个用户最多使用1次
            v2Coupon.setLimitUseWithUser(1);
            //设置使用范围
            v2Coupon.setLimitPlanIds("[\"1\",\"2\",\"4\",\"5\",\"6\",\"7\"]");
            //设置开始时间为结束时间减一天
            v2Coupon.setStartedAt(coupon.getExpire().intValue() - 86400);
            //设置结束时间
            v2Coupon.setEndedAt(coupon.getExpire().intValue());
            //设置创建时间为结束时间减一天
            v2Coupon.setCreatedAt(coupon.getExpire().intValue() - 86400);
            //设置修改时间为创建时间减一天
            v2Coupon.setUpdatedAt(coupon.getExpire().intValue() - 86400);
            //添加到对象集合
            v2CouponList.add(v2Coupon);
            //统计转换次数
            count++;
        }
        //批量插入到新的v2_coupon表
        insertV2boardCouponTable(v2CouponList);
        return count;
    }

    public void deleteV2boardCouponTable(){
        v2CouponService.truncateTable();
    }

    public void insertV2boardCouponTable(List<V2Coupon> v2CouponList){
        v2CouponService.batchInsert(v2CouponList);
    }
}
