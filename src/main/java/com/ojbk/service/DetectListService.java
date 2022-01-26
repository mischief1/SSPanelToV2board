package com.ojbk.service;

import java.util.List;
import com.ojbk.entity.DetectList;
import com.baomidou.mybatisplus.extension.service.IService;
public interface DetectListService extends IService<DetectList>{


    int updateBatch(List<DetectList> list);

    int updateBatchSelective(List<DetectList> list);

    int batchInsert(List<DetectList> list);

    int insertOrUpdate(DetectList record);

    int insertOrUpdateSelective(DetectList record);

}
