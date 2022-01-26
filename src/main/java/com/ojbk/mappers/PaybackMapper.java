package com.ojbk.mappers;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ojbk.entity.Payback;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PaybackMapper extends BaseMapper<Payback> {
    int updateBatch(List<Payback> list);

    int updateBatchSelective(List<Payback> list);

    int batchInsert(@Param("list") List<Payback> list);

    int insertOrUpdate(Payback record);

    int insertOrUpdateSelective(Payback record);
}