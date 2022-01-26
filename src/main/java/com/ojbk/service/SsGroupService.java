package com.ojbk.service;

import java.util.List;
import com.ojbk.entity.SsGroup;
import com.baomidou.mybatisplus.extension.service.IService;
public interface SsGroupService extends IService<SsGroup>{


    int updateBatch(List<SsGroup> list);

    int updateBatchSelective(List<SsGroup> list);

    int batchInsert(List<SsGroup> list);

    int insertOrUpdate(SsGroup record);

    int insertOrUpdateSelective(SsGroup record);

}
