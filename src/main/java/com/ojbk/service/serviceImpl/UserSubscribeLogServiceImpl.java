package com.ojbk.service.serviceImpl;

import org.springframework.stereotype.Service;

import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ojbk.entity.UserSubscribeLog;
import com.ojbk.mappers.UserSubscribeLogMapper;
import com.ojbk.service.UserSubscribeLogService;
@Service
public class UserSubscribeLogServiceImpl extends ServiceImpl<UserSubscribeLogMapper, UserSubscribeLog> implements UserSubscribeLogService{

    @Override
    public int updateBatch(List<UserSubscribeLog> list) {
        return baseMapper.updateBatch(list);
    }
    @Override
    public int updateBatchSelective(List<UserSubscribeLog> list) {
        return baseMapper.updateBatchSelective(list);
    }
    @Override
    public int batchInsert(List<UserSubscribeLog> list) {
        return baseMapper.batchInsert(list);
    }
    @Override
    public int insertOrUpdate(UserSubscribeLog record) {
        return baseMapper.insertOrUpdate(record);
    }
    @Override
    public int insertOrUpdateSelective(UserSubscribeLog record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
