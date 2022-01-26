package com.ojbk.service;

import com.ojbk.entity.TelegramSession;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.IService;
public interface TelegramSessionService extends IService<TelegramSession>{


    int updateBatch(List<TelegramSession> list);

    int updateBatchSelective(List<TelegramSession> list);

    int batchInsert(List<TelegramSession> list);

    int insertOrUpdate(TelegramSession record);

    int insertOrUpdateSelective(TelegramSession record);

}
