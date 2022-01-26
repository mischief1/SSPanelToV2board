package com.ojbk.service.serviceImpl;

import org.springframework.stereotype.Service;

import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ojbk.entity.SsGroup;
import com.ojbk.mappers.SsGroupMapper;
import com.ojbk.service.SsGroupService;
@Service
public class SsGroupServiceImpl extends ServiceImpl<SsGroupMapper, SsGroup> implements SsGroupService{

    @Override
    public int updateBatch(List<SsGroup> list) {
        return baseMapper.updateBatch(list);
    }
    @Override
    public int updateBatchSelective(List<SsGroup> list) {
        return baseMapper.updateBatchSelective(list);
    }
    @Override
    public int batchInsert(List<SsGroup> list) {
        return baseMapper.batchInsert(list);
    }
    @Override
    public int insertOrUpdate(SsGroup record) {
        return baseMapper.insertOrUpdate(record);
    }
    @Override
    public int insertOrUpdateSelective(SsGroup record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
