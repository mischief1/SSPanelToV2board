package com.ojbk.service.serviceImpl;

import com.baomidou.dynamic.datasource.annotation.DS;
import org.springframework.stereotype.Service;

import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ojbk.entity.V2User;
import com.ojbk.mappers.V2UserMapper;
import com.ojbk.service.V2UserService;

import javax.annotation.Resource;

@Service
public class V2UserServiceImpl extends ServiceImpl<V2UserMapper, V2User> implements V2UserService{

    @Resource
    private V2UserMapper v2UserMapper;

    @Override
    public int updateBatch(List<V2User> list) {
        return baseMapper.updateBatch(list);
    }
    @Override
    public int updateBatchSelective(List<V2User> list) {
        return baseMapper.updateBatchSelective(list);
    }
    @Override
    @DS("v2board")
    public int batchInsert(List<V2User> list) {
        return baseMapper.batchInsert(list);
    }
    @Override
    public int insertOrUpdate(V2User record) {
        return baseMapper.insertOrUpdate(record);
    }
    @Override
    public int insertOrUpdateSelective(V2User record) {
        return baseMapper.insertOrUpdateSelective(record);
    }

    @Override
    @DS("v2board")
    public void deleteall() {
        v2UserMapper.deleteall();
    }

    @Override
    @DS("v2board")
    public void insert(V2User v2User) {
        v2UserMapper.insert(v2User);
    }
}
