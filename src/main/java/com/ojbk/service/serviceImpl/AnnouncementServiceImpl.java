package com.ojbk.service.serviceImpl;

import org.springframework.stereotype.Service;

import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ojbk.mappers.AnnouncementMapper;
import com.ojbk.entity.Announcement;
import com.ojbk.service.AnnouncementService;
@Service
public class AnnouncementServiceImpl extends ServiceImpl<AnnouncementMapper, Announcement> implements AnnouncementService{

    @Override
    public int updateBatch(List<Announcement> list) {
        return baseMapper.updateBatch(list);
    }
    @Override
    public int updateBatchSelective(List<Announcement> list) {
        return baseMapper.updateBatchSelective(list);
    }
    @Override
    public int batchInsert(List<Announcement> list) {
        return baseMapper.batchInsert(list);
    }
    @Override
    public int insertOrUpdate(Announcement record) {
        return baseMapper.insertOrUpdate(record);
    }
    @Override
    public int insertOrUpdateSelective(Announcement record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
