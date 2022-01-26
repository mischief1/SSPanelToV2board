package com.ojbk.mappers;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ojbk.entity.UserSubscribeLog;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserSubscribeLogMapper extends BaseMapper<UserSubscribeLog> {
    int updateBatch(List<UserSubscribeLog> list);

    int updateBatchSelective(List<UserSubscribeLog> list);

    int batchInsert(@Param("list") List<UserSubscribeLog> list);

    int insertOrUpdate(UserSubscribeLog record);

    int insertOrUpdateSelective(UserSubscribeLog record);
}