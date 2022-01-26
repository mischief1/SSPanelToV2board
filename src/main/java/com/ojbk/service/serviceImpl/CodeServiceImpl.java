package com.ojbk.service.serviceImpl;

import org.springframework.stereotype.Service;

import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ojbk.entity.Code;
import com.ojbk.mappers.CodeMapper;
import com.ojbk.service.CodeService;
@Service
public class CodeServiceImpl extends ServiceImpl<CodeMapper, Code> implements CodeService{

    @Override
    public int updateBatch(List<Code> list) {
        return baseMapper.updateBatch(list);
    }
    @Override
    public int updateBatchSelective(List<Code> list) {
        return baseMapper.updateBatchSelective(list);
    }
    @Override
    public int batchInsert(List<Code> list) {
        return baseMapper.batchInsert(list);
    }
    @Override
    public int insertOrUpdate(Code record) {
        return baseMapper.insertOrUpdate(record);
    }
    @Override
    public int insertOrUpdateSelective(Code record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
