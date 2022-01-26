package com.ojbk.service.serviceImpl;

import org.springframework.stereotype.Service;

import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ojbk.mappers.DetectLogMapper;
import com.ojbk.entity.DetectLog;
import com.ojbk.service.DetectLogService;
@Service
public class DetectLogServiceImpl extends ServiceImpl<DetectLogMapper, DetectLog> implements DetectLogService{

    @Override
    public int updateBatch(List<DetectLog> list) {
        return baseMapper.updateBatch(list);
    }
    @Override
    public int updateBatchSelective(List<DetectLog> list) {
        return baseMapper.updateBatchSelective(list);
    }
    @Override
    public int batchInsert(List<DetectLog> list) {
        return baseMapper.batchInsert(list);
    }
    @Override
    public int insertOrUpdate(DetectLog record) {
        return baseMapper.insertOrUpdate(record);
    }
    @Override
    public int insertOrUpdateSelective(DetectLog record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
