package com.ojbk.mappers;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ojbk.entity.Paylist;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PaylistMapper extends BaseMapper<Paylist> {
    int updateBatch(List<Paylist> list);

    int updateBatchSelective(List<Paylist> list);

    int batchInsert(@Param("list") List<Paylist> list);

    int insertOrUpdate(Paylist record);

    int insertOrUpdateSelective(Paylist record);
}