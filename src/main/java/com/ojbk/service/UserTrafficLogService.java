package com.ojbk.service;

import java.util.List;
import com.ojbk.entity.UserTrafficLog;
import com.baomidou.mybatisplus.extension.service.IService;
public interface UserTrafficLogService extends IService<UserTrafficLog>{


    int updateBatch(List<UserTrafficLog> list);

    int updateBatchSelective(List<UserTrafficLog> list);

    int batchInsert(List<UserTrafficLog> list);

    int insertOrUpdate(UserTrafficLog record);

    int insertOrUpdateSelective(UserTrafficLog record);

}
