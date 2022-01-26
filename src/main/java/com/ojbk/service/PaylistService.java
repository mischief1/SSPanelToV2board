package com.ojbk.service;

import java.util.List;
import com.ojbk.entity.Paylist;
import com.baomidou.mybatisplus.extension.service.IService;
public interface PaylistService extends IService<Paylist>{


    int updateBatch(List<Paylist> list);

    int updateBatchSelective(List<Paylist> list);

    int batchInsert(List<Paylist> list);

    int insertOrUpdate(Paylist record);

    int insertOrUpdateSelective(Paylist record);

}
