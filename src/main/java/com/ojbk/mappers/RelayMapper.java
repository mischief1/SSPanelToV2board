package com.ojbk.mappers;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ojbk.entity.Relay;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface RelayMapper extends BaseMapper<Relay> {
    int updateBatch(List<Relay> list);

    int updateBatchSelective(List<Relay> list);

    int batchInsert(@Param("list") List<Relay> list);

    int insertOrUpdate(Relay record);

    int insertOrUpdateSelective(Relay record);
}