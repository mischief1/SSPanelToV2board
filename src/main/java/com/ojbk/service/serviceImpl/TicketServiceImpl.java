package com.ojbk.service.serviceImpl;

import org.springframework.stereotype.Service;

import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ojbk.mappers.TicketMapper;
import com.ojbk.entity.Ticket;
import com.ojbk.service.TicketService;
@Service
public class TicketServiceImpl extends ServiceImpl<TicketMapper, Ticket> implements TicketService{

    @Override
    public int updateBatch(List<Ticket> list) {
        return baseMapper.updateBatch(list);
    }
    @Override
    public int updateBatchSelective(List<Ticket> list) {
        return baseMapper.updateBatchSelective(list);
    }
    @Override
    public int batchInsert(List<Ticket> list) {
        return baseMapper.batchInsert(list);
    }
    @Override
    public int insertOrUpdate(Ticket record) {
        return baseMapper.insertOrUpdate(record);
    }
    @Override
    public int insertOrUpdateSelective(Ticket record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
