package com.ojbk.service.serviceImpl;

import org.springframework.stereotype.Service;

import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ojbk.mappers.LinkMapper;
import com.ojbk.entity.Link;
import com.ojbk.service.LinkService;
@Service
public class LinkServiceImpl extends ServiceImpl<LinkMapper, Link> implements LinkService{

    @Override
    public int updateBatch(List<Link> list) {
        return baseMapper.updateBatch(list);
    }
    @Override
    public int updateBatchSelective(List<Link> list) {
        return baseMapper.updateBatchSelective(list);
    }
    @Override
    public int batchInsert(List<Link> list) {
        return baseMapper.batchInsert(list);
    }
    @Override
    public int insertOrUpdate(Link record) {
        return baseMapper.insertOrUpdate(record);
    }
    @Override
    public int insertOrUpdateSelective(Link record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
