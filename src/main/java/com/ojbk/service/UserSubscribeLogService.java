package com.ojbk.service;

import java.util.List;
import com.ojbk.entity.UserSubscribeLog;
import com.baomidou.mybatisplus.extension.service.IService;
public interface UserSubscribeLogService extends IService<UserSubscribeLog>{


    int updateBatch(List<UserSubscribeLog> list);

    int updateBatchSelective(List<UserSubscribeLog> list);

    int batchInsert(List<UserSubscribeLog> list);

    int insertOrUpdate(UserSubscribeLog record);

    int insertOrUpdateSelective(UserSubscribeLog record);

}
