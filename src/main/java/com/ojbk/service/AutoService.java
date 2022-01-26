package com.ojbk.service;

import java.util.List;
import com.ojbk.entity.Auto;
import com.baomidou.mybatisplus.extension.service.IService;
public interface AutoService extends IService<Auto>{


    int updateBatch(List<Auto> list);

    int updateBatchSelective(List<Auto> list);

    int batchInsert(List<Auto> list);

    int insertOrUpdate(Auto record);

    int insertOrUpdateSelective(Auto record);

}
