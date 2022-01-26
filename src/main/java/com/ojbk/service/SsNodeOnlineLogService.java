package com.ojbk.service;

import java.util.List;
import com.ojbk.entity.SsNodeOnlineLog;
import com.baomidou.mybatisplus.extension.service.IService;
public interface SsNodeOnlineLogService extends IService<SsNodeOnlineLog>{


    int updateBatch(List<SsNodeOnlineLog> list);

    int updateBatchSelective(List<SsNodeOnlineLog> list);

    int batchInsert(List<SsNodeOnlineLog> list);

    int insertOrUpdate(SsNodeOnlineLog record);

    int insertOrUpdateSelective(SsNodeOnlineLog record);

}
