package com.ojbk.service;

import java.util.List;
import com.ojbk.entity.RadiusBan;
import com.baomidou.mybatisplus.extension.service.IService;
public interface RadiusBanService extends IService<RadiusBan>{


    int updateBatch(List<RadiusBan> list);

    int updateBatchSelective(List<RadiusBan> list);

    int batchInsert(List<RadiusBan> list);

    int insertOrUpdate(RadiusBan record);

    int insertOrUpdateSelective(RadiusBan record);

}
