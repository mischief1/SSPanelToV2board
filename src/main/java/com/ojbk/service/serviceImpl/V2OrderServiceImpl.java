package com.ojbk.service.serviceImpl;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import java.util.List;

import com.ojbk.entity.V2Order;
import com.ojbk.mappers.V2OrderMapper;
import com.ojbk.service.V2OrderService;

import javax.annotation.Resource;

@Service
public class V2OrderServiceImpl extends ServiceImpl<V2OrderMapper, V2Order> implements V2OrderService{

    @Resource
    private V2OrderMapper v2OrderMapper;

    @Override
    public int updateBatch(List<V2Order> list) {
        return baseMapper.updateBatch(list);
    }
    @Override
    public int updateBatchSelective(List<V2Order> list) {
        return baseMapper.updateBatchSelective(list);
    }
    @Override
    @DS("v2board")
    public int batchInsert(List<V2Order> list) {
        return baseMapper.batchInsert(list);
    }
    @Override
    public int insertOrUpdate(V2Order record) {
        return baseMapper.insertOrUpdate(record);
    }
    @Override
    public int insertOrUpdateSelective(V2Order record) {
        return baseMapper.insertOrUpdateSelective(record);
    }

    @Override
    @DS("v2board")
    public void delete() {
        QueryWrapper<V2Order> v2OrderQueryWrapper = new QueryWrapper<>();
        v2OrderMapper.delete(v2OrderQueryWrapper);
    }

    @Override
    @DS("v2board")
    public void insert(V2Order v2Order) {
        v2OrderMapper.insert(v2Order);
    }
}
