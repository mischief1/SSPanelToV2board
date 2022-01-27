package com.ojbk.service.serviceImpl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.ojbk.entity.V2InviteCode;
import com.ojbk.mappers.V2InviteCodeMapper;
import com.ojbk.service.V2InviteCodeService;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ojbk.entity.SsInviteCode;
import com.ojbk.mappers.SsInviteCodeMapper;
import com.ojbk.service.SsInviteCodeService;

import javax.annotation.Resource;

@Service
public class SsInviteCodeServiceImpl extends ServiceImpl<SsInviteCodeMapper, SsInviteCode> implements SsInviteCodeService{

    @Resource
    private  SsInviteCodeMapper ssInviteCodeMapper;
    @Resource
    private V2InviteCodeService v2InviteCodeService;

    @Override
    public int updateBatch(List<SsInviteCode> list) {
        return baseMapper.updateBatch(list);
    }
    @Override
    public int updateBatchSelective(List<SsInviteCode> list) {
        return baseMapper.updateBatchSelective(list);
    }
    @Override
    public int batchInsert(List<SsInviteCode> list) {
        return baseMapper.batchInsert(list);
    }
    @Override
    public int insertOrUpdate(SsInviteCode record) {
        return baseMapper.insertOrUpdate(record);
    }
    @Override
    public int insertOrUpdateSelective(SsInviteCode record) {
        return baseMapper.insertOrUpdateSelective(record);
    }

    @Override
    public int ConversionSsInviteCodeTable() throws ParseException {
        //清空v2_invite_code表
        deleteV2InviteCodeTable();
        int count = 0;
        V2InviteCode v2InviteCode = new V2InviteCode();
        QueryWrapper<SsInviteCode> queryWrapper = new QueryWrapper<>();
        List<SsInviteCode> ssInviteCodeList = ssInviteCodeMapper.selectList(queryWrapper);
        //转换对象集合
        List<V2InviteCode> v2InviteCodeList = new ArrayList<>();
        for (SsInviteCode ssInviteCode : ssInviteCodeList){
            v2InviteCode.setId(ssInviteCode.getId());
            v2InviteCode.setUserId(ssInviteCode.getUserId());
            v2InviteCode.setCode(ssInviteCode.getCode());
            v2InviteCode.setStatus(0);
            v2InviteCode.setPv(0);
            Date createdAt = ssInviteCode.getCreatedAt();
            Date updatedAt = ssInviteCode.getUpdatedAt();
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            Date parse = simpleDateFormat.parse(simpleDateFormat.format(createdAt));
            Date parse1 = simpleDateFormat.parse(simpleDateFormat.format(updatedAt));
            v2InviteCode.setCreatedAt(parse.getTime()/1000);
            v2InviteCode.setUpdatedAt(parse1.getTime()/1000);
            //添加到转换对象集合
            v2InviteCodeList.add(v2InviteCode);
            count++;
        }
        //批量插入v2_invite_code表
        insertV2InviteCodeTable(v2InviteCodeList);
        return count;
    }

    public void deleteV2InviteCodeTable(){
        v2InviteCodeService.truncateTable();
    }

    public void insertV2InviteCodeTable(List<V2InviteCode> v2InviteCodeList){
        v2InviteCodeService.batchInsert(v2InviteCodeList);
    }
}
