package com.ojbk.mappers;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ojbk.entity.Code;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface CodeMapper extends BaseMapper<Code> {
    int updateBatch(List<Code> list);

    int updateBatchSelective(List<Code> list);

    int batchInsert(@Param("list") List<Code> list);

    int insertOrUpdate(Code record);

    int insertOrUpdateSelective(Code record);
}