package com.ojbk.service;

import java.util.List;
import com.ojbk.entity.V2Order;
import com.baomidou.mybatisplus.extension.service.IService;
public interface V2OrderService extends IService<V2Order>{


    int updateBatch(List<V2Order> list);

    int updateBatchSelective(List<V2Order> list);

    int batchInsert(List<V2Order> list);

    int insertOrUpdate(V2Order record);

    int insertOrUpdateSelective(V2Order record);

    void delete();

    void insert(V2Order v2Order);

    void truncateTable();
}
