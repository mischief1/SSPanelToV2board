package com.ojbk.service;

import java.util.List;
import com.ojbk.entity.TelegramTasks;
import com.baomidou.mybatisplus.extension.service.IService;
public interface TelegramTasksService extends IService<TelegramTasks>{


    int updateBatch(List<TelegramTasks> list);

    int updateBatchSelective(List<TelegramTasks> list);

    int batchInsert(List<TelegramTasks> list);

    int insertOrUpdate(TelegramTasks record);

    int insertOrUpdateSelective(TelegramTasks record);

}
