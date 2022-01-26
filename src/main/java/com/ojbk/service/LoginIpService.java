package com.ojbk.service;

import java.util.List;
import com.ojbk.entity.LoginIp;
import com.baomidou.mybatisplus.extension.service.IService;
public interface LoginIpService extends IService<LoginIp>{


    int updateBatch(List<LoginIp> list);

    int updateBatchSelective(List<LoginIp> list);

    int batchInsert(List<LoginIp> list);

    int insertOrUpdate(LoginIp record);

    int insertOrUpdateSelective(LoginIp record);

}
