package com.ojbk.mappers;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ojbk.entity.Link;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface LinkMapper extends BaseMapper<Link> {
    int updateBatch(List<Link> list);

    int updateBatchSelective(List<Link> list);

    int batchInsert(@Param("list") List<Link> list);

    int insertOrUpdate(Link record);

    int insertOrUpdateSelective(Link record);
}