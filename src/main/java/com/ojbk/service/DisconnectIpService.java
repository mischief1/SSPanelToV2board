package com.ojbk.service;

import java.util.List;
import com.ojbk.entity.DisconnectIp;
import com.baomidou.mybatisplus.extension.service.IService;
public interface DisconnectIpService extends IService<DisconnectIp>{


    int updateBatch(List<DisconnectIp> list);

    int updateBatchSelective(List<DisconnectIp> list);

    int batchInsert(List<DisconnectIp> list);

    int insertOrUpdate(DisconnectIp record);

    int insertOrUpdateSelective(DisconnectIp record);

}
