package com.ojbk.mappers;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ojbk.entity.TelegramTasks;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface TelegramTasksMapper extends BaseMapper<TelegramTasks> {
    int updateBatch(List<TelegramTasks> list);

    int updateBatchSelective(List<TelegramTasks> list);

    int batchInsert(@Param("list") List<TelegramTasks> list);

    int insertOrUpdate(TelegramTasks record);

    int insertOrUpdateSelective(TelegramTasks record);
}