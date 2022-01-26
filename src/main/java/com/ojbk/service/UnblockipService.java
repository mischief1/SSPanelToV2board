package com.ojbk.service;

import java.util.List;
import com.ojbk.entity.Unblockip;
import com.baomidou.mybatisplus.extension.service.IService;
public interface UnblockipService extends IService<Unblockip>{


    int updateBatch(List<Unblockip> list);

    int updateBatchSelective(List<Unblockip> list);

    int batchInsert(List<Unblockip> list);

    int insertOrUpdate(Unblockip record);

    int insertOrUpdateSelective(Unblockip record);

}
