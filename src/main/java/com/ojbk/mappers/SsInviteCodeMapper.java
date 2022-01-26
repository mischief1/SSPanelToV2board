package com.ojbk.mappers;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ojbk.entity.SsInviteCode;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface SsInviteCodeMapper extends BaseMapper<SsInviteCode> {
    int updateBatch(List<SsInviteCode> list);

    int updateBatchSelective(List<SsInviteCode> list);

    int batchInsert(@Param("list") List<SsInviteCode> list);

    int insertOrUpdate(SsInviteCode record);

    int insertOrUpdateSelective(SsInviteCode record);
}