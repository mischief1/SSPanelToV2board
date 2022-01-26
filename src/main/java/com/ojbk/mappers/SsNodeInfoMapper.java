package com.ojbk.mappers;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ojbk.entity.SsNodeInfo;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface SsNodeInfoMapper extends BaseMapper<SsNodeInfo> {
    int updateBatch(List<SsNodeInfo> list);

    int updateBatchSelective(List<SsNodeInfo> list);

    int batchInsert(@Param("list") List<SsNodeInfo> list);

    int insertOrUpdate(SsNodeInfo record);

    int insertOrUpdateSelective(SsNodeInfo record);
}