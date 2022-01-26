package com.ojbk.mappers;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ojbk.entity.Blockip;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface BlockipMapper extends BaseMapper<Blockip> {
    int updateBatch(List<Blockip> list);

    int updateBatchSelective(List<Blockip> list);

    int batchInsert(@Param("list") List<Blockip> list);

    int insertOrUpdate(Blockip record);

    int insertOrUpdateSelective(Blockip record);
}