package com.ojbk.service.serviceImpl;

import org.springframework.stereotype.Service;

import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ojbk.entity.EmailVerify;
import com.ojbk.mappers.EmailVerifyMapper;
import com.ojbk.service.EmailVerifyService;
@Service
public class EmailVerifyServiceImpl extends ServiceImpl<EmailVerifyMapper, EmailVerify> implements EmailVerifyService{

    @Override
    public int updateBatch(List<EmailVerify> list) {
        return baseMapper.updateBatch(list);
    }
    @Override
    public int updateBatchSelective(List<EmailVerify> list) {
        return baseMapper.updateBatchSelective(list);
    }
    @Override
    public int batchInsert(List<EmailVerify> list) {
        return baseMapper.batchInsert(list);
    }
    @Override
    public int insertOrUpdate(EmailVerify record) {
        return baseMapper.insertOrUpdate(record);
    }
    @Override
    public int insertOrUpdateSelective(EmailVerify record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
