package com.ojbk.service;

import java.util.List;
import com.ojbk.entity.Gconfig;
import com.baomidou.mybatisplus.extension.service.IService;
public interface GconfigService extends IService<Gconfig>{


    int updateBatch(List<Gconfig> list);

    int updateBatchSelective(List<Gconfig> list);

    int batchInsert(List<Gconfig> list);

    int insertOrUpdate(Gconfig record);

    int insertOrUpdateSelective(Gconfig record);

}
