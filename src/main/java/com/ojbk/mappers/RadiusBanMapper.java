package com.ojbk.mappers;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ojbk.entity.RadiusBan;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface RadiusBanMapper extends BaseMapper<RadiusBan> {
    int updateBatch(List<RadiusBan> list);

    int updateBatchSelective(List<RadiusBan> list);

    int batchInsert(@Param("list") List<RadiusBan> list);

    int insertOrUpdate(RadiusBan record);

    int insertOrUpdateSelective(RadiusBan record);
}