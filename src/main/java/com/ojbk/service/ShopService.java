package com.ojbk.service;

import java.util.List;
import com.ojbk.entity.Shop;
import com.baomidou.mybatisplus.extension.service.IService;
public interface ShopService extends IService<Shop>{


    int updateBatch(List<Shop> list);

    int updateBatchSelective(List<Shop> list);

    int batchInsert(List<Shop> list);

    int insertOrUpdate(Shop record);

    int insertOrUpdateSelective(Shop record);

}
