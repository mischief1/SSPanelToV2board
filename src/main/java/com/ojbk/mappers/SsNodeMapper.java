package com.ojbk.mappers;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ojbk.entity.SsNode;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface SsNodeMapper extends BaseMapper<SsNode> {
    int updateBatch(List<SsNode> list);

    int updateBatchSelective(List<SsNode> list);

    int batchInsert(@Param("list") List<SsNode> list);

    int insertOrUpdate(SsNode record);

    int insertOrUpdateSelective(SsNode record);
}