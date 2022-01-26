package com.ojbk.service.serviceImpl;

import org.springframework.stereotype.Service;

import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ojbk.mappers.SsNodeOnlineLogMapper;
import com.ojbk.entity.SsNodeOnlineLog;
import com.ojbk.service.SsNodeOnlineLogService;
@Service
public class SsNodeOnlineLogServiceImpl extends ServiceImpl<SsNodeOnlineLogMapper, SsNodeOnlineLog> implements SsNodeOnlineLogService{

    @Override
    public int updateBatch(List<SsNodeOnlineLog> list) {
        return baseMapper.updateBatch(list);
    }
    @Override
    public int updateBatchSelective(List<SsNodeOnlineLog> list) {
        return baseMapper.updateBatchSelective(list);
    }
    @Override
    public int batchInsert(List<SsNodeOnlineLog> list) {
        return baseMapper.batchInsert(list);
    }
    @Override
    public int insertOrUpdate(SsNodeOnlineLog record) {
        return baseMapper.insertOrUpdate(record);
    }
    @Override
    public int insertOrUpdateSelective(SsNodeOnlineLog record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
