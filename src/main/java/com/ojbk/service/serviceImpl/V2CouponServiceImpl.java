package com.ojbk.service.serviceImpl;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.ojbk.mappers.V2UserMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ojbk.entity.V2Coupon;
import com.ojbk.mappers.V2CouponMapper;
import com.ojbk.service.V2CouponService;

import javax.annotation.Resource;

@Service
public class V2CouponServiceImpl extends ServiceImpl<V2CouponMapper, V2Coupon> implements V2CouponService{

    @Resource
    private V2CouponMapper v2CouponMapper;

    @Override
    public int updateBatch(List<V2Coupon> list) {
        return baseMapper.updateBatch(list);
    }
    @Override
    public int updateBatchSelective(List<V2Coupon> list) {
        return baseMapper.updateBatchSelective(list);
    }
    @Override
    @DS("v2board")
    public int batchInsert(List<V2Coupon> list) {
        return baseMapper.batchInsert(list);
    }
    @Override
    public int insertOrUpdate(V2Coupon record) {
        return baseMapper.insertOrUpdate(record);
    }
    @Override
    public int insertOrUpdateSelective(V2Coupon record) {
        return baseMapper.insertOrUpdateSelective(record);
    }

    @Override
    @DS("v2board")
    public void delete() {
        QueryWrapper<V2Coupon> v2CouponQueryWrapper = new QueryWrapper<>();
        v2CouponMapper.delete(v2CouponQueryWrapper);
    }

    @Override
    @DS("v2board")
    public void insert(V2Coupon v2Coupon) {
        v2CouponMapper.insert(v2Coupon);
    }
}
