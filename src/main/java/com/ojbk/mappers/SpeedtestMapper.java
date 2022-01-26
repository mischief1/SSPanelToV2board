package com.ojbk.mappers;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ojbk.entity.Speedtest;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface SpeedtestMapper extends BaseMapper<Speedtest> {
    int updateBatch(List<Speedtest> list);

    int updateBatchSelective(List<Speedtest> list);

    int batchInsert(@Param("list") List<Speedtest> list);

    int insertOrUpdate(Speedtest record);

    int insertOrUpdateSelective(Speedtest record);
}