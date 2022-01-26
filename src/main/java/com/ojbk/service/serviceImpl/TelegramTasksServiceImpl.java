package com.ojbk.service.serviceImpl;

import org.springframework.stereotype.Service;

import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ojbk.mappers.TelegramTasksMapper;
import com.ojbk.entity.TelegramTasks;
import com.ojbk.service.TelegramTasksService;
@Service
public class TelegramTasksServiceImpl extends ServiceImpl<TelegramTasksMapper, TelegramTasks> implements TelegramTasksService{

    @Override
    public int updateBatch(List<TelegramTasks> list) {
        return baseMapper.updateBatch(list);
    }
    @Override
    public int updateBatchSelective(List<TelegramTasks> list) {
        return baseMapper.updateBatchSelective(list);
    }
    @Override
    public int batchInsert(List<TelegramTasks> list) {
        return baseMapper.batchInsert(list);
    }
    @Override
    public int insertOrUpdate(TelegramTasks record) {
        return baseMapper.insertOrUpdate(record);
    }
    @Override
    public int insertOrUpdateSelective(TelegramTasks record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
