package com.ojbk.mappers;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ojbk.entity.SsPasswordReset;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface SsPasswordResetMapper extends BaseMapper<SsPasswordReset> {
    int updateBatch(List<SsPasswordReset> list);

    int updateBatchSelective(List<SsPasswordReset> list);

    int batchInsert(@Param("list") List<SsPasswordReset> list);

    int insertOrUpdate(SsPasswordReset record);

    int insertOrUpdateSelective(SsPasswordReset record);
}