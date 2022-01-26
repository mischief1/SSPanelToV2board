package com.ojbk.service;

import java.util.List;
import com.ojbk.entity.Ticket;
import com.baomidou.mybatisplus.extension.service.IService;
public interface TicketService extends IService<Ticket>{


    int updateBatch(List<Ticket> list);

    int updateBatchSelective(List<Ticket> list);

    int batchInsert(List<Ticket> list);

    int insertOrUpdate(Ticket record);

    int insertOrUpdateSelective(Ticket record);

}
