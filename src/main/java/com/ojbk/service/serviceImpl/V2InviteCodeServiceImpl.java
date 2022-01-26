package com.ojbk.service.serviceImpl;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.springframework.stereotype.Service;

import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ojbk.entity.V2InviteCode;
import com.ojbk.mappers.V2InviteCodeMapper;
import com.ojbk.service.V2InviteCodeService;

import javax.annotation.Resource;

@Service
public class V2InviteCodeServiceImpl extends ServiceImpl<V2InviteCodeMapper, V2InviteCode> implements V2InviteCodeService{

    @Resource
    private V2InviteCodeMapper v2InviteCodeMapper;

    @Override
    public int updateBatch(List<V2InviteCode> list) {
        return baseMapper.updateBatch(list);
    }
    @Override
    public int updateBatchSelective(List<V2InviteCode> list) {
        return baseMapper.updateBatchSelective(list);
    }
    @Override
    @DS("v2board")
    public int batchInsert(List<V2InviteCode> list) {
        return baseMapper.batchInsert(list);
    }
    @Override
    public int insertOrUpdate(V2InviteCode record) {
        return baseMapper.insertOrUpdate(record);
    }
    @Override
    public int insertOrUpdateSelective(V2InviteCode record) {
        return baseMapper.insertOrUpdateSelective(record);
    }

    @Override
    @DS("v2board")
    public void delete() {
        QueryWrapper<V2InviteCode> v2InviteCodeQueryWrapper = new QueryWrapper<>();
        v2InviteCodeMapper.delete(v2InviteCodeQueryWrapper);
    }

    @Override
    @DS("v2board")
    public void insert(V2InviteCode v2InviteCode) {
        v2InviteCodeMapper.insert(v2InviteCode);
    }
}
