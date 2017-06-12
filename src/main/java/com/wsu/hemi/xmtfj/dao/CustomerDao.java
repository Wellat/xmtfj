package com.wsu.hemi.xmtfj.dao;

import com.wsu.hemi.xmtfj.entity.TransactionInfo;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;


/**
 * Created by Hemi on 2017/6/9.
 */
@Repository
public interface CustomerDao {

    List<Date> getDistinctDateInTran();

    List<TransactionInfo> getAllSumInTran();
}
