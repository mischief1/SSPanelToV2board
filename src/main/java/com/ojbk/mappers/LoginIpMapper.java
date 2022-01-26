package com.ojbk.mappers;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ojbk.entity.LoginIp;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface LoginIpMapper extends BaseMapper<LoginIp> {
    int updateBatch(List<LoginIp> list);

    int updateBatchSelective(List<LoginIp> list);

    int batchInsert(@Param("list") List<LoginIp> list);

    int insertOrUpdate(LoginIp record);

    int insertOrUpdateSelective(LoginIp record);
}