package com.ojbk.service.serviceImpl;

import org.springframework.stereotype.Service;

import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ojbk.entity.Gconfig;
import com.ojbk.mappers.GconfigMapper;
import com.ojbk.service.GconfigService;
@Service
public class GconfigServiceImpl extends ServiceImpl<GconfigMapper, Gconfig> implements GconfigService{

    @Override
    public int updateBatch(List<Gconfig> list) {
        return baseMapper.updateBatch(list);
    }
    @Override
    public int updateBatchSelective(List<Gconfig> list) {
        return baseMapper.updateBatchSelective(list);
    }
    @Override
    public int batchInsert(List<Gconfig> list) {
        return baseMapper.batchInsert(list);
    }
    @Override
    public int insertOrUpdate(Gconfig record) {
        return baseMapper.insertOrUpdate(record);
    }
    @Override
    public int insertOrUpdateSelective(Gconfig record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
