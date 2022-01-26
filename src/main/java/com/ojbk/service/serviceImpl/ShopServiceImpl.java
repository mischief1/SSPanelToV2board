package com.ojbk.service.serviceImpl;

import org.springframework.stereotype.Service;

import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ojbk.entity.Shop;
import com.ojbk.mappers.ShopMapper;
import com.ojbk.service.ShopService;
@Service
public class ShopServiceImpl extends ServiceImpl<ShopMapper, Shop> implements ShopService{

    @Override
    public int updateBatch(List<Shop> list) {
        return baseMapper.updateBatch(list);
    }
    @Override
    public int updateBatchSelective(List<Shop> list) {
        return baseMapper.updateBatchSelective(list);
    }
    @Override
    public int batchInsert(List<Shop> list) {
        return baseMapper.batchInsert(list);
    }
    @Override
    public int insertOrUpdate(Shop record) {
        return baseMapper.insertOrUpdate(record);
    }
    @Override
    public int insertOrUpdateSelective(Shop record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
