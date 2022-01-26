package com.ojbk.mappers;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ojbk.entity.Unblockip;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UnblockipMapper extends BaseMapper<Unblockip> {
    int updateBatch(List<Unblockip> list);

    int updateBatchSelective(List<Unblockip> list);

    int batchInsert(@Param("list") List<Unblockip> list);

    int insertOrUpdate(Unblockip record);

    int insertOrUpdateSelective(Unblockip record);
}