package com.ojbk.mappers;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ojbk.entity.DetectLog;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface DetectLogMapper extends BaseMapper<DetectLog> {
    int updateBatch(List<DetectLog> list);

    int updateBatchSelective(List<DetectLog> list);

    int batchInsert(@Param("list") List<DetectLog> list);

    int insertOrUpdate(DetectLog record);

    int insertOrUpdateSelective(DetectLog record);
}