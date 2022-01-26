package com.ojbk.mappers;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ojbk.entity.Gconfig;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface GconfigMapper extends BaseMapper<Gconfig> {
    int updateBatch(List<Gconfig> list);

    int updateBatchSelective(List<Gconfig> list);

    int batchInsert(@Param("list") List<Gconfig> list);

    int insertOrUpdate(Gconfig record);

    int insertOrUpdateSelective(Gconfig record);
}