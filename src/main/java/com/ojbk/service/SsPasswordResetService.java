package com.ojbk.service;

import java.util.List;
import com.ojbk.entity.SsPasswordReset;
import com.baomidou.mybatisplus.extension.service.IService;
public interface SsPasswordResetService extends IService<SsPasswordReset>{


    int updateBatch(List<SsPasswordReset> list);

    int updateBatchSelective(List<SsPasswordReset> list);

    int batchInsert(List<SsPasswordReset> list);

    int insertOrUpdate(SsPasswordReset record);

    int insertOrUpdateSelective(SsPasswordReset record);

}
