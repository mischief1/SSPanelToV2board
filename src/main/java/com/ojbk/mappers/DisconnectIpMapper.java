package com.ojbk.mappers;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ojbk.entity.DisconnectIp;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface DisconnectIpMapper extends BaseMapper<DisconnectIp> {
    int updateBatch(List<DisconnectIp> list);

    int updateBatchSelective(List<DisconnectIp> list);

    int batchInsert(@Param("list") List<DisconnectIp> list);

    int insertOrUpdate(DisconnectIp record);

    int insertOrUpdateSelective(DisconnectIp record);
}