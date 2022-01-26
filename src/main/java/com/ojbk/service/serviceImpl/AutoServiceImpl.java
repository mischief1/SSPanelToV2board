package com.ojbk.service.serviceImpl;

import org.springframework.stereotype.Service;

import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ojbk.entity.Auto;
import com.ojbk.mappers.AutoMapper;
import com.ojbk.service.AutoService;
@Service
public class AutoServiceImpl extends ServiceImpl<AutoMapper, Auto> implements AutoService{

    @Override
    public int updateBatch(List<Auto> list) {
        return baseMapper.updateBatch(list);
    }
    @Override
    public int updateBatchSelective(List<Auto> list) {
        return baseMapper.updateBatchSelective(list);
    }
    @Override
    public int batchInsert(List<Auto> list) {
        return baseMapper.batchInsert(list);
    }
    @Override
    public int insertOrUpdate(Auto record) {
        return baseMapper.insertOrUpdate(record);
    }
    @Override
    public int insertOrUpdateSelective(Auto record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
