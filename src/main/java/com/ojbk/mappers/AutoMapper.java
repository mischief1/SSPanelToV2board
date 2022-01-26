package com.ojbk.mappers;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ojbk.entity.Auto;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface AutoMapper extends BaseMapper<Auto> {
    int updateBatch(List<Auto> list);

    int updateBatchSelective(List<Auto> list);

    int batchInsert(@Param("list") List<Auto> list);

    int insertOrUpdate(Auto record);

    int insertOrUpdateSelective(Auto record);
}