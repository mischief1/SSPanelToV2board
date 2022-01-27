package com.ojbk.mappers;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ojbk.entity.V2Order;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface V2OrderMapper extends BaseMapper<V2Order> {
    int updateBatch(List<V2Order> list);

    int updateBatchSelective(List<V2Order> list);

    int batchInsert(@Param("list") List<V2Order> list);

    int insertOrUpdate(V2Order record);

    int insertOrUpdateSelective(V2Order record);

    void truncateTable();
}