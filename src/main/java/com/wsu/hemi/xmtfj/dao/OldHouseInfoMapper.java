package com.wsu.hemi.xmtfj.dao;

import com.wsu.hemi.xmtfj.entity.OldHouseInfo;
import com.wsu.hemi.xmtfj.entity.OldHouseInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OldHouseInfoMapper {
    int countByExample(OldHouseInfoExample example);

    int deleteByExample(OldHouseInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(OldHouseInfo record);

    int insertSelective(OldHouseInfo record);

    List<OldHouseInfo> selectByExample(OldHouseInfoExample example);

    OldHouseInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") OldHouseInfo record, @Param("example") OldHouseInfoExample example);

    int updateByExample(@Param("record") OldHouseInfo record, @Param("example") OldHouseInfoExample example);

    int updateByPrimaryKeySelective(OldHouseInfo record);

    int updateByPrimaryKey(OldHouseInfo record);
}