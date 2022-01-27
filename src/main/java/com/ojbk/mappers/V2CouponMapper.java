package com.ojbk.mappers;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ojbk.entity.V2Coupon;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface V2CouponMapper extends BaseMapper<V2Coupon> {
    int updateBatch(List<V2Coupon> list);

    int updateBatchSelective(List<V2Coupon> list);

    int batchInsert(@Param("list") List<V2Coupon> list);

    int insertOrUpdate(V2Coupon record);

    int insertOrUpdateSelective(V2Coupon record);

    void truncateTable();
}