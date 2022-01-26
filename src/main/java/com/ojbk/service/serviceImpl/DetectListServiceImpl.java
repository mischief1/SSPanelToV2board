package com.ojbk.service.serviceImpl;

import org.springframework.stereotype.Service;

import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ojbk.mappers.DetectListMapper;
import com.ojbk.entity.DetectList;
import com.ojbk.service.DetectListService;
@Service
public class DetectListServiceImpl extends ServiceImpl<DetectListMapper, DetectList> implements DetectListService{

    @Override
    public int updateBatch(List<DetectList> list) {
        return baseMapper.updateBatch(list);
    }
    @Override
    public int updateBatchSelective(List<DetectList> list) {
        return baseMapper.updateBatchSelective(list);
    }
    @Override
    public int batchInsert(List<DetectList> list) {
        return baseMapper.batchInsert(list);
    }
    @Override
    public int insertOrUpdate(DetectList record) {
        return baseMapper.insertOrUpdate(record);
    }
    @Override
    public int insertOrUpdateSelective(DetectList record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
