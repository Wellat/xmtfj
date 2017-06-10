package com.wsu.hemi.xmtfj.dao;

import com.wsu.hemi.xmtfj.entity.TransactionInfo;
import com.wsu.hemi.xmtfj.entity.TransactionInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface TransactionInfoMapper {
    int countByExample(TransactionInfoExample example);

    int deleteByExample(TransactionInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TransactionInfo record);

    int insertSelective(TransactionInfo record);

    List<TransactionInfo> selectByExample(TransactionInfoExample example);

    TransactionInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TransactionInfo record, @Param("example") TransactionInfoExample example);

    int updateByExample(@Param("record") TransactionInfo record, @Param("example") TransactionInfoExample example);

    int updateByPrimaryKeySelective(TransactionInfo record);

    int updateByPrimaryKey(TransactionInfo record);
}