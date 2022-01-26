package com.ojbk.service;

import java.util.List;
import com.ojbk.entity.Relay;
import com.baomidou.mybatisplus.extension.service.IService;
public interface RelayService extends IService<Relay>{


    int updateBatch(List<Relay> list);

    int updateBatchSelective(List<Relay> list);

    int batchInsert(List<Relay> list);

    int insertOrUpdate(Relay record);

    int insertOrUpdateSelective(Relay record);

}
