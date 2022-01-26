package com.ojbk.service;

import java.util.List;
import com.ojbk.entity.UserToken;
import com.baomidou.mybatisplus.extension.service.IService;
public interface UserTokenService extends IService<UserToken>{


    int updateBatch(List<UserToken> list);

    int updateBatchSelective(List<UserToken> list);

    int batchInsert(List<UserToken> list);

    int insertOrUpdate(UserToken record);

    int insertOrUpdateSelective(UserToken record);

}
