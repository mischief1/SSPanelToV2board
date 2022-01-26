package com.ojbk.service.serviceImpl;

import org.springframework.stereotype.Service;

import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ojbk.entity.RadiusBan;
import com.ojbk.mappers.RadiusBanMapper;
import com.ojbk.service.RadiusBanService;
@Service
public class RadiusBanServiceImpl extends ServiceImpl<RadiusBanMapper, RadiusBan> implements RadiusBanService{

    @Override
    public int updateBatch(List<RadiusBan> list) {
        return baseMapper.updateBatch(list);
    }
    @Override
    public int updateBatchSelective(List<RadiusBan> list) {
        return baseMapper.updateBatchSelective(list);
    }
    @Override
    public int batchInsert(List<RadiusBan> list) {
        return baseMapper.batchInsert(list);
    }
    @Override
    public int insertOrUpdate(RadiusBan record) {
        return baseMapper.insertOrUpdate(record);
    }
    @Override
    public int insertOrUpdateSelective(RadiusBan record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
