package com.ojbk.service;

import java.util.List;
import com.ojbk.entity.Speedtest;
import com.baomidou.mybatisplus.extension.service.IService;
public interface SpeedtestService extends IService<Speedtest>{


    int updateBatch(List<Speedtest> list);

    int updateBatchSelective(List<Speedtest> list);

    int batchInsert(List<Speedtest> list);

    int insertOrUpdate(Speedtest record);

    int insertOrUpdateSelective(Speedtest record);

}
