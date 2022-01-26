package com.ojbk.mappers;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ojbk.entity.SsGroup;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface SsGroupMapper extends BaseMapper<SsGroup> {
    int updateBatch(List<SsGroup> list);

    int updateBatchSelective(List<SsGroup> list);

    int batchInsert(@Param("list") List<SsGroup> list);

    int insertOrUpdate(SsGroup record);

    int insertOrUpdateSelective(SsGroup record);
}