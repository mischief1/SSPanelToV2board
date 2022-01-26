package com.ojbk.service;

import java.util.List;
import com.ojbk.entity.Link;
import com.baomidou.mybatisplus.extension.service.IService;
public interface LinkService extends IService<Link>{


    int updateBatch(List<Link> list);

    int updateBatchSelective(List<Link> list);

    int batchInsert(List<Link> list);

    int insertOrUpdate(Link record);

    int insertOrUpdateSelective(Link record);

}
