package com.ojbk.mappers;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ojbk.entity.Ticket;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface TicketMapper extends BaseMapper<Ticket> {
    int updateBatch(List<Ticket> list);

    int updateBatchSelective(List<Ticket> list);

    int batchInsert(@Param("list") List<Ticket> list);

    int insertOrUpdate(Ticket record);

    int insertOrUpdateSelective(Ticket record);
}