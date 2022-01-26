package com.ojbk.service;

import java.util.List;
import com.ojbk.entity.DetectBanLog;
import com.baomidou.mybatisplus.extension.service.IService;
public interface DetectBanLogService extends IService<DetectBanLog>{


    int updateBatch(List<DetectBanLog> list);

    int updateBatchSelective(List<DetectBanLog> list);

    int batchInsert(List<DetectBanLog> list);

    int insertOrUpdate(DetectBanLog record);

    int insertOrUpdateSelective(DetectBanLog record);

}
