package com.ojbk.service;

import java.util.List;
import com.ojbk.entity.Announcement;
import com.baomidou.mybatisplus.extension.service.IService;
public interface AnnouncementService extends IService<Announcement>{


    int updateBatch(List<Announcement> list);

    int updateBatchSelective(List<Announcement> list);

    int batchInsert(List<Announcement> list);

    int insertOrUpdate(Announcement record);

    int insertOrUpdateSelective(Announcement record);

}
