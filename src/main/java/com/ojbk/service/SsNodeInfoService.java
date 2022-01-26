package com.ojbk.service;

import java.util.List;
import com.ojbk.entity.SsNodeInfo;
import com.baomidou.mybatisplus.extension.service.IService;
public interface SsNodeInfoService extends IService<SsNodeInfo>{


    int updateBatch(List<SsNodeInfo> list);

    int updateBatchSelective(List<SsNodeInfo> list);

    int batchInsert(List<SsNodeInfo> list);

    int insertOrUpdate(SsNodeInfo record);

    int insertOrUpdateSelective(SsNodeInfo record);

}
