package com.ojbk.service.serviceImpl;

import org.springframework.stereotype.Service;

import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ojbk.entity.TelegramSession;
import com.ojbk.mappers.TelegramSessionMapper;
import com.ojbk.service.TelegramSessionService;
@Service
public class TelegramSessionServiceImpl extends ServiceImpl<TelegramSessionMapper, TelegramSession> implements TelegramSessionService{

    @Override
    public int updateBatch(List<TelegramSession> list) {
        return baseMapper.updateBatch(list);
    }
    @Override
    public int updateBatchSelective(List<TelegramSession> list) {
        return baseMapper.updateBatchSelective(list);
    }
    @Override
    public int batchInsert(List<TelegramSession> list) {
        return baseMapper.batchInsert(list);
    }
    @Override
    public int insertOrUpdate(TelegramSession record) {
        return baseMapper.insertOrUpdate(record);
    }
    @Override
    public int insertOrUpdateSelective(TelegramSession record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
