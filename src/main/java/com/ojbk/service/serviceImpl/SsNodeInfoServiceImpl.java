package com.ojbk.service.serviceImpl;

import org.springframework.stereotype.Service;

import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ojbk.mappers.SsNodeInfoMapper;
import com.ojbk.entity.SsNodeInfo;
import com.ojbk.service.SsNodeInfoService;
@Service
public class SsNodeInfoServiceImpl extends ServiceImpl<SsNodeInfoMapper, SsNodeInfo> implements SsNodeInfoService{

    @Override
    public int updateBatch(List<SsNodeInfo> list) {
        return baseMapper.updateBatch(list);
    }
    @Override
    public int updateBatchSelective(List<SsNodeInfo> list) {
        return baseMapper.updateBatchSelective(list);
    }
    @Override
    public int batchInsert(List<SsNodeInfo> list) {
        return baseMapper.batchInsert(list);
    }
    @Override
    public int insertOrUpdate(SsNodeInfo record) {
        return baseMapper.insertOrUpdate(record);
    }
    @Override
    public int insertOrUpdateSelective(SsNodeInfo record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
