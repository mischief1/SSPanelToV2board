package com.ojbk.service.serviceImpl;

import org.springframework.stereotype.Service;

import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ojbk.entity.AliveIp;
import com.ojbk.mappers.AliveIpMapper;
import com.ojbk.service.AliveIpService;
@Service
public class AliveIpServiceImpl extends ServiceImpl<AliveIpMapper, AliveIp> implements AliveIpService{

    @Override
    public int updateBatch(List<AliveIp> list) {
        return baseMapper.updateBatch(list);
    }
    @Override
    public int updateBatchSelective(List<AliveIp> list) {
        return baseMapper.updateBatchSelective(list);
    }
    @Override
    public int batchInsert(List<AliveIp> list) {
        return baseMapper.batchInsert(list);
    }
    @Override
    public int insertOrUpdate(AliveIp record) {
        return baseMapper.insertOrUpdate(record);
    }
    @Override
    public int insertOrUpdateSelective(AliveIp record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
