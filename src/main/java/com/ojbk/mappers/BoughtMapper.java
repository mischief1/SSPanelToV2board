package com.ojbk.mappers;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ojbk.entity.Bought;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface BoughtMapper extends BaseMapper<Bought> {
    int updateBatch(List<Bought> list);

    int updateBatchSelective(List<Bought> list);

    int batchInsert(@Param("list") List<Bought> list);

    int insertOrUpdate(Bought record);

    int insertOrUpdateSelective(Bought record);
}