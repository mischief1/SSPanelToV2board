package com.ojbk.service;

import com.ojbk.entity.V2InviteCode;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.IService;
public interface V2InviteCodeService extends IService<V2InviteCode>{


    int updateBatch(List<V2InviteCode> list);

    int updateBatchSelective(List<V2InviteCode> list);

    int batchInsert(List<V2InviteCode> list);

    int insertOrUpdate(V2InviteCode record);

    int insertOrUpdateSelective(V2InviteCode record);

    void delete();

    void insert(V2InviteCode v2InviteCode);
}
