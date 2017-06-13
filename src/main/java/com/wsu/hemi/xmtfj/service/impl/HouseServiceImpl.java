package com.wsu.hemi.xmtfj.service.impl;

import com.wsu.hemi.xmtfj.dao.CustomerDao;
import com.wsu.hemi.xmtfj.dao.HouseInfoMapper;
import com.wsu.hemi.xmtfj.dao.OldHouseInfoMapper;
import com.wsu.hemi.xmtfj.dao.TransactionInfoMapper;
import com.wsu.hemi.xmtfj.entity.*;
import com.wsu.hemi.xmtfj.service.HouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * Created by Hemi on 2017/6/9.
 */
@Service
public class HouseServiceImpl implements HouseService {

    @Autowired
    CustomerDao customerDao;
    @Autowired
    HouseInfoMapper houseInfoMapper;
    @Autowired
    TransactionInfoMapper transactionInfoMapper;
    @Autowired
    OldHouseInfoMapper oldHouseInfoMapper;

    @Override
    public List<OldHouseInfo> getOldHouseInfo() {
        OldHouseInfoExample example = new OldHouseInfoExample();
        OldHouseInfoExample.Criteria criteria = example.createCriteria();
        criteria.andSellNumNotEqualTo(0);
        example.setOrderByClause("date asc");
        return oldHouseInfoMapper.selectByExample(example);
    }

    @Override
    public HouseInfo getNewestHouseInfo() {
        HouseInfoExample example = new HouseInfoExample();
        example.setOrderByClause("date desc,id desc");
        return houseInfoMapper.selectByExample(example).get(0);
    }

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

    @Override
    public List<TransactionInfo> getHotSpfBylimit(int limit) {
        return customerDao.getHotSpfBylimit(limit);
    }
}
