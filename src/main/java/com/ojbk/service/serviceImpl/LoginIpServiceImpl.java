package com.ojbk.service.serviceImpl;

import org.springframework.stereotype.Service;

import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ojbk.entity.LoginIp;
import com.ojbk.mappers.LoginIpMapper;
import com.ojbk.service.LoginIpService;
@Service
public class LoginIpServiceImpl extends ServiceImpl<LoginIpMapper, LoginIp> implements LoginIpService{

    @Override
    public int updateBatch(List<LoginIp> list) {
        return baseMapper.updateBatch(list);
    }
    @Override
    public int updateBatchSelective(List<LoginIp> list) {
        return baseMapper.updateBatchSelective(list);
    }
    @Override
    public int batchInsert(List<LoginIp> list) {
        return baseMapper.batchInsert(list);
    }
    @Override
    public int insertOrUpdate(LoginIp record) {
        return baseMapper.insertOrUpdate(record);
    }
    @Override
    public int insertOrUpdateSelective(LoginIp record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
