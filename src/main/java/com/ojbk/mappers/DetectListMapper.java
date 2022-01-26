package com.ojbk.mappers;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ojbk.entity.DetectList;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface DetectListMapper extends BaseMapper<DetectList> {
    int updateBatch(List<DetectList> list);

    int updateBatchSelective(List<DetectList> list);

    int batchInsert(@Param("list") List<DetectList> list);

    int insertOrUpdate(DetectList record);

    int insertOrUpdateSelective(DetectList record);
}