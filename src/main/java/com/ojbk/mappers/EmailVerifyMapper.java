package com.ojbk.mappers;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ojbk.entity.EmailVerify;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface EmailVerifyMapper extends BaseMapper<EmailVerify> {
    int updateBatch(List<EmailVerify> list);

    int updateBatchSelective(List<EmailVerify> list);

    int batchInsert(@Param("list") List<EmailVerify> list);

    int insertOrUpdate(EmailVerify record);

    int insertOrUpdateSelective(EmailVerify record);
}