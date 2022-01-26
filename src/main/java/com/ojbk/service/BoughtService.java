package com.ojbk.service;

import java.util.List;
import com.ojbk.entity.Bought;
import com.baomidou.mybatisplus.extension.service.IService;
public interface BoughtService extends IService<Bought>{


    int updateBatch(List<Bought> list);

    int updateBatchSelective(List<Bought> list);

    int batchInsert(List<Bought> list);

    int insertOrUpdate(Bought record);

    int insertOrUpdateSelective(Bought record);

    int ConversionBoughtTable();
}
