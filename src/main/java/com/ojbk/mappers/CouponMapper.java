package com.ojbk.mappers;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ojbk.entity.Coupon;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface CouponMapper extends BaseMapper<Coupon> {
    int updateBatch(List<Coupon> list);

    int updateBatchSelective(List<Coupon> list);

    int batchInsert(@Param("list") List<Coupon> list);

    int insertOrUpdate(Coupon record);

    int insertOrUpdateSelective(Coupon record);
}