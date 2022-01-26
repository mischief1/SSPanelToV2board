package com.ojbk.service;

import com.ojbk.entity.AliveIp;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.IService;
public interface AliveIpService extends IService<AliveIp>{


    int updateBatch(List<AliveIp> list);

    int updateBatchSelective(List<AliveIp> list);

    int batchInsert(List<AliveIp> list);

    int insertOrUpdate(AliveIp record);

    int insertOrUpdateSelective(AliveIp record);

}
