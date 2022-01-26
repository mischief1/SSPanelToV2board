package com.ojbk.service;

import com.ojbk.entity.Code;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.IService;
public interface CodeService extends IService<Code>{


    int updateBatch(List<Code> list);

    int updateBatchSelective(List<Code> list);

    int batchInsert(List<Code> list);

    int insertOrUpdate(Code record);

    int insertOrUpdateSelective(Code record);

}
