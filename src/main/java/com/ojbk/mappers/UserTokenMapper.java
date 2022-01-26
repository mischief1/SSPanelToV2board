package com.ojbk.mappers;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ojbk.entity.UserToken;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserTokenMapper extends BaseMapper<UserToken> {
    int updateBatch(List<UserToken> list);

    int updateBatchSelective(List<UserToken> list);

    int batchInsert(@Param("list") List<UserToken> list);

    int insertOrUpdate(UserToken record);

    int insertOrUpdateSelective(UserToken record);
}