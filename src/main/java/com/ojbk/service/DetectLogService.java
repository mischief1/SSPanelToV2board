package com.ojbk.service;

import java.util.List;
import com.ojbk.entity.DetectLog;
import com.baomidou.mybatisplus.extension.service.IService;
public interface DetectLogService extends IService<DetectLog>{


    int updateBatch(List<DetectLog> list);

    int updateBatchSelective(List<DetectLog> list);

    int batchInsert(List<DetectLog> list);

    int insertOrUpdate(DetectLog record);

    int insertOrUpdateSelective(DetectLog record);

}
