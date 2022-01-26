package com.ojbk.service;

import java.util.List;
import com.ojbk.entity.Payback;
import com.baomidou.mybatisplus.extension.service.IService;
public interface PaybackService extends IService<Payback>{


    int updateBatch(List<Payback> list);

    int updateBatchSelective(List<Payback> list);

    int batchInsert(List<Payback> list);

    int insertOrUpdate(Payback record);

    int insertOrUpdateSelective(Payback record);

}
