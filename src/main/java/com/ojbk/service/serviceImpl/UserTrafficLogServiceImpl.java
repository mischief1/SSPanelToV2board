package com.ojbk.service.serviceImpl;

import org.springframework.stereotype.Service;

import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ojbk.mappers.UserTrafficLogMapper;
import com.ojbk.entity.UserTrafficLog;
import com.ojbk.service.UserTrafficLogService;
@Service
public class UserTrafficLogServiceImpl extends ServiceImpl<UserTrafficLogMapper, UserTrafficLog> implements UserTrafficLogService{

    @Override
    public int updateBatch(List<UserTrafficLog> list) {
        return baseMapper.updateBatch(list);
    }
    @Override
    public int updateBatchSelective(List<UserTrafficLog> list) {
        return baseMapper.updateBatchSelective(list);
    }
    @Override
    public int batchInsert(List<UserTrafficLog> list) {
        return baseMapper.batchInsert(list);
    }
    @Override
    public int insertOrUpdate(UserTrafficLog record) {
        return baseMapper.insertOrUpdate(record);
    }
    @Override
    public int insertOrUpdateSelective(UserTrafficLog record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
