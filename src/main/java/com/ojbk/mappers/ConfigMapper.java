package com.ojbk.mappers;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ojbk.entity.Config;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface ConfigMapper extends BaseMapper<Config> {
    int updateBatch(List<Config> list);

    int updateBatchSelective(List<Config> list);

    int batchInsert(@Param("list") List<Config> list);

    int insertOrUpdate(Config record);

    int insertOrUpdateSelective(Config record);
}