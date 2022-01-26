package com.ojbk.service;

import java.util.List;
import com.ojbk.entity.Blockip;
import com.baomidou.mybatisplus.extension.service.IService;
public interface BlockipService extends IService<Blockip>{


    int updateBatch(List<Blockip> list);

    int updateBatchSelective(List<Blockip> list);

    int batchInsert(List<Blockip> list);

    int insertOrUpdate(Blockip record);

    int insertOrUpdateSelective(Blockip record);

}
