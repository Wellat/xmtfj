package com.wsu.hemi.xmtfj.dao;

import com.wsu.hemi.xmtfj.entity.HouseInfo;
import com.wsu.hemi.xmtfj.entity.HouseInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface HouseInfoMapper {
    int countByExample(HouseInfoExample example);

    int deleteByExample(HouseInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(HouseInfo record);

    int insertSelective(HouseInfo record);

    List<HouseInfo> selectByExample(HouseInfoExample example);

    HouseInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") HouseInfo record, @Param("example") HouseInfoExample example);

    int updateByExample(@Param("record") HouseInfo record, @Param("example") HouseInfoExample example);

    int updateByPrimaryKeySelective(HouseInfo record);

    int updateByPrimaryKey(HouseInfo record);
}