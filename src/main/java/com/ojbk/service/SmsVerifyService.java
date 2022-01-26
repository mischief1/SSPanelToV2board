package com.ojbk.service;

import java.util.List;
import com.ojbk.entity.SmsVerify;
import com.baomidou.mybatisplus.extension.service.IService;
public interface SmsVerifyService extends IService<SmsVerify>{


    int updateBatch(List<SmsVerify> list);

    int updateBatchSelective(List<SmsVerify> list);

    int batchInsert(List<SmsVerify> list);

    int insertOrUpdate(SmsVerify record);

    int insertOrUpdateSelective(SmsVerify record);

}
