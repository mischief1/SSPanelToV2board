package com.ojbk.service.serviceImpl;

import org.springframework.stereotype.Service;

import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ojbk.mappers.SmsVerifyMapper;
import com.ojbk.entity.SmsVerify;
import com.ojbk.service.SmsVerifyService;
@Service
public class SmsVerifyServiceImpl extends ServiceImpl<SmsVerifyMapper, SmsVerify> implements SmsVerifyService{

    @Override
    public int updateBatch(List<SmsVerify> list) {
        return baseMapper.updateBatch(list);
    }
    @Override
    public int updateBatchSelective(List<SmsVerify> list) {
        return baseMapper.updateBatchSelective(list);
    }
    @Override
    public int batchInsert(List<SmsVerify> list) {
        return baseMapper.batchInsert(list);
    }
    @Override
    public int insertOrUpdate(SmsVerify record) {
        return baseMapper.insertOrUpdate(record);
    }
    @Override
    public int insertOrUpdateSelective(SmsVerify record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
