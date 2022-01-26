package com.ojbk.service.serviceImpl;

import org.springframework.stereotype.Service;

import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ojbk.mappers.BlockipMapper;
import com.ojbk.entity.Blockip;
import com.ojbk.service.BlockipService;
@Service
public class BlockipServiceImpl extends ServiceImpl<BlockipMapper, Blockip> implements BlockipService{

    @Override
    public int updateBatch(List<Blockip> list) {
        return baseMapper.updateBatch(list);
    }
    @Override
    public int updateBatchSelective(List<Blockip> list) {
        return baseMapper.updateBatchSelective(list);
    }
    @Override
    public int batchInsert(List<Blockip> list) {
        return baseMapper.batchInsert(list);
    }
    @Override
    public int insertOrUpdate(Blockip record) {
        return baseMapper.insertOrUpdate(record);
    }
    @Override
    public int insertOrUpdateSelective(Blockip record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
