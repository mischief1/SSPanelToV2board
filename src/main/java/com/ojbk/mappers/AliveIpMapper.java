package com.ojbk.mappers;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ojbk.entity.AliveIp;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface AliveIpMapper extends BaseMapper<AliveIp> {
    int updateBatch(List<AliveIp> list);

    int updateBatchSelective(List<AliveIp> list);

    int batchInsert(@Param("list") List<AliveIp> list);

    int insertOrUpdate(AliveIp record);

    int insertOrUpdateSelective(AliveIp record);
}