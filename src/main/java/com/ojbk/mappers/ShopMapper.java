package com.ojbk.mappers;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ojbk.entity.Shop;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface ShopMapper extends BaseMapper<Shop> {
    int updateBatch(List<Shop> list);

    int updateBatchSelective(List<Shop> list);

    int batchInsert(@Param("list") List<Shop> list);

    int insertOrUpdate(Shop record);

    int insertOrUpdateSelective(Shop record);
}