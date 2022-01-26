package com.ojbk.service.serviceImpl;

import org.springframework.stereotype.Service;

import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ojbk.mappers.PaylistMapper;
import com.ojbk.entity.Paylist;
import com.ojbk.service.PaylistService;
@Service
public class PaylistServiceImpl extends ServiceImpl<PaylistMapper, Paylist> implements PaylistService{

    @Override
    public int updateBatch(List<Paylist> list) {
        return baseMapper.updateBatch(list);
    }
    @Override
    public int updateBatchSelective(List<Paylist> list) {
        return baseMapper.updateBatchSelective(list);
    }
    @Override
    public int batchInsert(List<Paylist> list) {
        return baseMapper.batchInsert(list);
    }
    @Override
    public int insertOrUpdate(Paylist record) {
        return baseMapper.insertOrUpdate(record);
    }
    @Override
    public int insertOrUpdateSelective(Paylist record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
