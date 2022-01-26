package com.ojbk.mappers;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ojbk.entity.TelegramSession;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface TelegramSessionMapper extends BaseMapper<TelegramSession> {
    int updateBatch(List<TelegramSession> list);

    int updateBatchSelective(List<TelegramSession> list);

    int batchInsert(@Param("list") List<TelegramSession> list);

    int insertOrUpdate(TelegramSession record);

    int insertOrUpdateSelective(TelegramSession record);
}