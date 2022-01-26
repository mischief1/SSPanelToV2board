package com.ojbk.service.serviceImpl;

import org.springframework.stereotype.Service;

import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ojbk.entity.UserToken;
import com.ojbk.mappers.UserTokenMapper;
import com.ojbk.service.UserTokenService;
@Service
public class UserTokenServiceImpl extends ServiceImpl<UserTokenMapper, UserToken> implements UserTokenService{

    @Override
    public int updateBatch(List<UserToken> list) {
        return baseMapper.updateBatch(list);
    }
    @Override
    public int updateBatchSelective(List<UserToken> list) {
        return baseMapper.updateBatchSelective(list);
    }
    @Override
    public int batchInsert(List<UserToken> list) {
        return baseMapper.batchInsert(list);
    }
    @Override
    public int insertOrUpdate(UserToken record) {
        return baseMapper.insertOrUpdate(record);
    }
    @Override
    public int insertOrUpdateSelective(UserToken record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
