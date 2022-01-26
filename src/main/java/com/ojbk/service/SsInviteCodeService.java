package com.ojbk.service;

import java.text.ParseException;
import java.util.List;
import com.ojbk.entity.SsInviteCode;
import com.baomidou.mybatisplus.extension.service.IService;
public interface SsInviteCodeService extends IService<SsInviteCode>{


    int updateBatch(List<SsInviteCode> list);

    int updateBatchSelective(List<SsInviteCode> list);

    int batchInsert(List<SsInviteCode> list);

    int insertOrUpdate(SsInviteCode record);

    int insertOrUpdateSelective(SsInviteCode record);

    int ConversionSsInviteCodeTable() throws ParseException;
}
