package com.ojbk.service.serviceImpl;

import org.springframework.stereotype.Service;

import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ojbk.entity.Relay;
import com.ojbk.mappers.RelayMapper;
import com.ojbk.service.RelayService;
@Service
public class RelayServiceImpl extends ServiceImpl<RelayMapper, Relay> implements RelayService{

    @Override
    public int updateBatch(List<Relay> list) {
        return baseMapper.updateBatch(list);
    }
    @Override
    public int updateBatchSelective(List<Relay> list) {
        return baseMapper.updateBatchSelective(list);
    }
    @Override
    public int batchInsert(List<Relay> list) {
        return baseMapper.batchInsert(list);
    }
    @Override
    public int insertOrUpdate(Relay record) {
        return baseMapper.insertOrUpdate(record);
    }
    @Override
    public int insertOrUpdateSelective(Relay record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
