package com.wsu.hemi.xmtfj.service;


import com.wsu.hemi.xmtfj.entity.HouseInfo;
import com.wsu.hemi.xmtfj.entity.OldHouseInfo;
import com.wsu.hemi.xmtfj.entity.TransactionInfo;

import java.util.Date;
import java.util.List;

/**
 * Created by Hemi on 2017/6/9.
 */
public interface HouseService {
    List<Date> getAxisData();

    List<TransactionInfo> getByRegion(String region);

    List<TransactionInfo> getAllRegion();

    HouseInfo getNewestHouseInfo();

    List<TransactionInfo> getHotSpfBylimit(int limit);

    List<OldHouseInfo> getOldHouseInfo();
}
