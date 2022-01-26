package com.ojbk.service.serviceImpl;

import org.springframework.stereotype.Service;

import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ojbk.entity.Speedtest;
import com.ojbk.mappers.SpeedtestMapper;
import com.ojbk.service.SpeedtestService;
@Service
public class SpeedtestServiceImpl extends ServiceImpl<SpeedtestMapper, Speedtest> implements SpeedtestService{

    @Override
    public int updateBatch(List<Speedtest> list) {
        return baseMapper.updateBatch(list);
    }
    @Override
    public int updateBatchSelective(List<Speedtest> list) {
        return baseMapper.updateBatchSelective(list);
    }
    @Override
    public int batchInsert(List<Speedtest> list) {
        return baseMapper.batchInsert(list);
    }
    @Override
    public int insertOrUpdate(Speedtest record) {
        return baseMapper.insertOrUpdate(record);
    }
    @Override
    public int insertOrUpdateSelective(Speedtest record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
