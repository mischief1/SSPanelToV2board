package com.ojbk.service;

import com.ojbk.entity.V2User;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.IService;
public interface V2UserService extends IService<V2User>{


    int updateBatch(List<V2User> list);

    int updateBatchSelective(List<V2User> list);

    int batchInsert(List<V2User> list);

    int insertOrUpdate(V2User record);

    int insertOrUpdateSelective(V2User record);

    void deleteAll();

    void insert(V2User v2User);

    void truncateTable();

}
