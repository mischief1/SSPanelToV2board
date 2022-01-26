package com.ojbk.service.serviceImpl;

import org.springframework.stereotype.Service;

import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ojbk.mappers.UnblockipMapper;
import com.ojbk.entity.Unblockip;
import com.ojbk.service.UnblockipService;
@Service
public class UnblockipServiceImpl extends ServiceImpl<UnblockipMapper, Unblockip> implements UnblockipService{

    @Override
    public int updateBatch(List<Unblockip> list) {
        return baseMapper.updateBatch(list);
    }
    @Override
    public int updateBatchSelective(List<Unblockip> list) {
        return baseMapper.updateBatchSelective(list);
    }
    @Override
    public int batchInsert(List<Unblockip> list) {
        return baseMapper.batchInsert(list);
    }
    @Override
    public int insertOrUpdate(Unblockip record) {
        return baseMapper.insertOrUpdate(record);
    }
    @Override
    public int insertOrUpdateSelective(Unblockip record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
