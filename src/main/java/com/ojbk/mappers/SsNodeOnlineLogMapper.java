package com.ojbk.mappers;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ojbk.entity.SsNodeOnlineLog;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface SsNodeOnlineLogMapper extends BaseMapper<SsNodeOnlineLog> {
    int updateBatch(List<SsNodeOnlineLog> list);

    int updateBatchSelective(List<SsNodeOnlineLog> list);

    int batchInsert(@Param("list") List<SsNodeOnlineLog> list);

    int insertOrUpdate(SsNodeOnlineLog record);

    int insertOrUpdateSelective(SsNodeOnlineLog record);
}