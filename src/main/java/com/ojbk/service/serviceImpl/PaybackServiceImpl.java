package com.ojbk.service.serviceImpl;

import org.springframework.stereotype.Service;

import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ojbk.entity.Payback;
import com.ojbk.mappers.PaybackMapper;
import com.ojbk.service.PaybackService;
@Service
public class PaybackServiceImpl extends ServiceImpl<PaybackMapper, Payback> implements PaybackService{

    @Override
    public int updateBatch(List<Payback> list) {
        return baseMapper.updateBatch(list);
    }
    @Override
    public int updateBatchSelective(List<Payback> list) {
        return baseMapper.updateBatchSelective(list);
    }
    @Override
    public int batchInsert(List<Payback> list) {
        return baseMapper.batchInsert(list);
    }
    @Override
    public int insertOrUpdate(Payback record) {
        return baseMapper.insertOrUpdate(record);
    }
    @Override
    public int insertOrUpdateSelective(Payback record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
