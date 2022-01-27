package com.ojbk.mappers;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ojbk.entity.V2InviteCode;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface V2InviteCodeMapper extends BaseMapper<V2InviteCode> {
    int updateBatch(List<V2InviteCode> list);

    int updateBatchSelective(List<V2InviteCode> list);

    int batchInsert(@Param("list") List<V2InviteCode> list);

    int insertOrUpdate(V2InviteCode record);

    int insertOrUpdateSelective(V2InviteCode record);

    void truncateTable();
}