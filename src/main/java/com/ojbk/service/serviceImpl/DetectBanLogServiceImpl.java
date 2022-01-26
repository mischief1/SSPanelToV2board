package com.ojbk.service.serviceImpl;

import org.springframework.stereotype.Service;

import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ojbk.mappers.DetectBanLogMapper;
import com.ojbk.entity.DetectBanLog;
import com.ojbk.service.DetectBanLogService;
@Service
public class DetectBanLogServiceImpl extends ServiceImpl<DetectBanLogMapper, DetectBanLog> implements DetectBanLogService{

    @Override
    public int updateBatch(List<DetectBanLog> list) {
        return baseMapper.updateBatch(list);
    }
    @Override
    public int updateBatchSelective(List<DetectBanLog> list) {
        return baseMapper.updateBatchSelective(list);
    }
    @Override
    public int batchInsert(List<DetectBanLog> list) {
        return baseMapper.batchInsert(list);
    }
    @Override
    public int insertOrUpdate(DetectBanLog record) {
        return baseMapper.insertOrUpdate(record);
    }
    @Override
    public int insertOrUpdateSelective(DetectBanLog record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
