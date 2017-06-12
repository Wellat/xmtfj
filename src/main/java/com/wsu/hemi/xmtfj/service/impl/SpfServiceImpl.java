package com.wsu.hemi.xmtfj.service.impl;

import com.wsu.hemi.xmtfj.dao.CustomerDao;
import com.wsu.hemi.xmtfj.dao.TransactionInfoMapper;
import com.wsu.hemi.xmtfj.entity.TransactionInfo;
import com.wsu.hemi.xmtfj.entity.TransactionInfoExample;
import com.wsu.hemi.xmtfj.service.SpfService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * Created by Hemi on 2017/6/9.
 */
@Service
public class SpfServiceImpl implements SpfService {

    @Autowired
    CustomerDao customerDao;

    @Autowired
    TransactionInfoMapper transactionInfoMapper;

    @Override
    public List<Date> getAxisData() {
        return customerDao.getDistinctDateInTran();
    }

    @Override
    public List<TransactionInfo> getByRegion(String area) {
        TransactionInfoExample example = new TransactionInfoExample();
        TransactionInfoExample.Criteria criteria = example.createCriteria();
        criteria.andRegionEqualTo(area);
        example.setOrderByClause("date asc");
        return transactionInfoMapper.selectByExample(example);
    }

    @Override
    public List<TransactionInfo> getAllRegion() {
        return customerDao.getAllSumInTran();
    }
}
