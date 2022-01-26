package com.ojbk.service.serviceImpl;

import org.springframework.stereotype.Service;

import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ojbk.mappers.SsPasswordResetMapper;
import com.ojbk.entity.SsPasswordReset;
import com.ojbk.service.SsPasswordResetService;
@Service
public class SsPasswordResetServiceImpl extends ServiceImpl<SsPasswordResetMapper, SsPasswordReset> implements SsPasswordResetService{

    @Override
    public int updateBatch(List<SsPasswordReset> list) {
        return baseMapper.updateBatch(list);
    }
    @Override
    public int updateBatchSelective(List<SsPasswordReset> list) {
        return baseMapper.updateBatchSelective(list);
    }
    @Override
    public int batchInsert(List<SsPasswordReset> list) {
        return baseMapper.batchInsert(list);
    }
    @Override
    public int insertOrUpdate(SsPasswordReset record) {
        return baseMapper.insertOrUpdate(record);
    }
    @Override
    public int insertOrUpdateSelective(SsPasswordReset record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
