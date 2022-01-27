package com.ojbk.service;

import java.util.List;
import com.ojbk.entity.V2Coupon;
import com.baomidou.mybatisplus.extension.service.IService;
public interface V2CouponService extends IService<V2Coupon>{


    int updateBatch(List<V2Coupon> list);

    int updateBatchSelective(List<V2Coupon> list);

    int batchInsert(List<V2Coupon> list);

    int insertOrUpdate(V2Coupon record);

    int insertOrUpdateSelective(V2Coupon record);

    void delete();

    void insert(V2Coupon v2Coupon);

    void truncateTable();

}
