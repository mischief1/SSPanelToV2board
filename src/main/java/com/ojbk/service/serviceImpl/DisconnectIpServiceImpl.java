package com.ojbk.service.serviceImpl;

import org.springframework.stereotype.Service;

import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ojbk.entity.DisconnectIp;
import com.ojbk.mappers.DisconnectIpMapper;
import com.ojbk.service.DisconnectIpService;
@Service
public class DisconnectIpServiceImpl extends ServiceImpl<DisconnectIpMapper, DisconnectIp> implements DisconnectIpService{

    @Override
    public int updateBatch(List<DisconnectIp> list) {
        return baseMapper.updateBatch(list);
    }
    @Override
    public int updateBatchSelective(List<DisconnectIp> list) {
        return baseMapper.updateBatchSelective(list);
    }
    @Override
    public int batchInsert(List<DisconnectIp> list) {
        return baseMapper.batchInsert(list);
    }
    @Override
    public int insertOrUpdate(DisconnectIp record) {
        return baseMapper.insertOrUpdate(record);
    }
    @Override
    public int insertOrUpdateSelective(DisconnectIp record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
