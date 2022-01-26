package com.ojbk.mappers;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ojbk.entity.DetectBanLog;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface DetectBanLogMapper extends BaseMapper<DetectBanLog> {
    int updateBatch(List<DetectBanLog> list);

    int updateBatchSelective(List<DetectBanLog> list);

    int batchInsert(@Param("list") List<DetectBanLog> list);

    int insertOrUpdate(DetectBanLog record);

    int insertOrUpdateSelective(DetectBanLog record);
}