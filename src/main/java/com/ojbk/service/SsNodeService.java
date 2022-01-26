package com.ojbk.service;

import java.util.List;
import com.ojbk.entity.SsNode;
import com.baomidou.mybatisplus.extension.service.IService;
public interface SsNodeService extends IService<SsNode>{


    int updateBatch(List<SsNode> list);

    int updateBatchSelective(List<SsNode> list);

    int batchInsert(List<SsNode> list);

    int insertOrUpdate(SsNode record);

    int insertOrUpdateSelective(SsNode record);

}
