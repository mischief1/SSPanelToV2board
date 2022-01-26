package com.ojbk.mappers;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ojbk.entity.UserTrafficLog;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserTrafficLogMapper extends BaseMapper<UserTrafficLog> {
    int updateBatch(List<UserTrafficLog> list);

    int updateBatchSelective(List<UserTrafficLog> list);

    int batchInsert(@Param("list") List<UserTrafficLog> list);

    int insertOrUpdate(UserTrafficLog record);

    int insertOrUpdateSelective(UserTrafficLog record);
}