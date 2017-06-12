package com.wsu.hemi.xmtfj.service;


import com.wsu.hemi.xmtfj.entity.TransactionInfo;

import java.util.Date;
import java.util.List;

/**
 * Created by Hemi on 2017/6/9.
 */
public interface SpfService {
    List<Date> getAxisData();

    List<TransactionInfo> getByRegion(String region);

    List<TransactionInfo> getAllRegion();
}
