package com.ojbk.mappers;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ojbk.entity.V2User;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface V2UserMapper extends BaseMapper<V2User> {
    int updateBatch(List<V2User> list);

    int updateBatchSelective(List<V2User> list);

    int batchInsert(@Param("list") List<V2User> list);

    int insertOrUpdate(V2User record);

    int insertOrUpdateSelective(V2User record);

    void deleteall();
}