package com.ojbk.mappers;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ojbk.entity.SmsVerify;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface SmsVerifyMapper extends BaseMapper<SmsVerify> {
    int updateBatch(List<SmsVerify> list);

    int updateBatchSelective(List<SmsVerify> list);

    int batchInsert(@Param("list") List<SmsVerify> list);

    int insertOrUpdate(SmsVerify record);

    int insertOrUpdateSelective(SmsVerify record);
}