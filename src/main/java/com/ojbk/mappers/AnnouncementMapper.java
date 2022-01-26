package com.ojbk.mappers;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ojbk.entity.Announcement;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface AnnouncementMapper extends BaseMapper<Announcement> {
    int updateBatch(List<Announcement> list);

    int updateBatchSelective(List<Announcement> list);

    int batchInsert(@Param("list") List<Announcement> list);

    int insertOrUpdate(Announcement record);

    int insertOrUpdateSelective(Announcement record);
}