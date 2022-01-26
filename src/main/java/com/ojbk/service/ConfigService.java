package com.ojbk.service;

import java.util.List;
import com.ojbk.entity.Config;
import com.baomidou.mybatisplus.extension.service.IService;
public interface ConfigService extends IService<Config>{


    int updateBatch(List<Config> list);

    int updateBatchSelective(List<Config> list);

    int batchInsert(List<Config> list);

    int insertOrUpdate(Config record);

    int insertOrUpdateSelective(Config record);

}
