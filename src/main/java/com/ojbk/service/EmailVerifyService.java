package com.ojbk.service;

import java.util.List;
import com.ojbk.entity.EmailVerify;
import com.baomidou.mybatisplus.extension.service.IService;
public interface EmailVerifyService extends IService<EmailVerify>{


    int updateBatch(List<EmailVerify> list);

    int updateBatchSelective(List<EmailVerify> list);

    int batchInsert(List<EmailVerify> list);

    int insertOrUpdate(EmailVerify record);

    int insertOrUpdateSelective(EmailVerify record);

}
