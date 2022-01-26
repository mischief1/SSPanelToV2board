package com.ojbk.service.serviceImpl;

import org.springframework.stereotype.Service;

import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ojbk.entity.SsNode;
import com.ojbk.mappers.SsNodeMapper;
import com.ojbk.service.SsNodeService;
@Service
public class SsNodeServiceImpl extends ServiceImpl<SsNodeMapper, SsNode> implements SsNodeService{

    @Override
    public int updateBatch(List<SsNode> list) {
        return baseMapper.updateBatch(list);
    }
    @Override
    public int updateBatchSelective(List<SsNode> list) {
        return baseMapper.updateBatchSelective(list);
    }
    @Override
    public int batchInsert(List<SsNode> list) {
        return baseMapper.batchInsert(list);
    }
    @Override
    public int insertOrUpdate(SsNode record) {
        return baseMapper.insertOrUpdate(record);
    }
    @Override
    public int insertOrUpdateSelective(SsNode record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
