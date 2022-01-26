package com.ojbk.service;

import java.util.List;
import com.ojbk.entity.Coupon;
import com.baomidou.mybatisplus.extension.service.IService;
public interface CouponService extends IService<Coupon>{


    int updateBatch(List<Coupon> list);

    int updateBatchSelective(List<Coupon> list);

    int batchInsert(List<Coupon> list);

    int insertOrUpdate(Coupon record);

    int insertOrUpdateSelective(Coupon record);

    //转换优惠码表
    int ConversionCouponTable();
}
