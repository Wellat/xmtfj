package com.wsu.hemi.xmtfj.spider;

import com.geccocrawler.gecco.pipeline.Pipeline;
import com.wsu.hemi.xmtfj.dao.HouseInfoMapper;
import com.wsu.hemi.xmtfj.entity.HouseInfo;
import com.wsu.hemi.xmtfj.entity.OldHouseInfo;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by yexq on 2017/6/8.
 */
@Service("saveHouseInfo")
public class SaveHouseInfo implements Pipeline<HouseInfos> {
    private static final Logger LOGGER = Logger.getLogger(SaveHouseInfo.class);

    @Autowired
    HouseInfoMapper houseInfoMapper;

    @Override
    public void process(HouseInfos houseInfo) {
        List<String> stringList = houseInfo.getStr();

        HouseInfo info = new HouseInfo();

        String[] s = stringList.get(0).split("：");
        Pattern pattern = Pattern.compile("(\\d+(\\.\\d+)*)");
        Pattern datePattern = Pattern.compile("([0-9]{4}-[0-9]{1,2}-[0-9]{1,2} [0-9]{2}:[0-9]{1,2}:[0-9]{1,2})");
        Matcher matcher= datePattern.matcher(s[0]);
        if(matcher.find()){
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            try{
                info.setDate(sdf.parse(matcher.group()));
            }catch (ParseException e){
                LOGGER.error(e.getMessage());
                e.printStackTrace();
            }
        }

        matcher= pattern.matcher(s[1]);
        if(matcher.find()) info.setOnSellNum(Integer.valueOf(matcher.group()));
        matcher = pattern.matcher(s[2]);
        if(matcher.find()) info.setAllNum(Integer.valueOf(matcher.group()));
        matcher = pattern.matcher(s[3]);
        if(matcher.find()) info.setCanSellNum(Integer.valueOf(matcher.group()));
        matcher = pattern.matcher(s[4]);
        if(matcher.find()) info.setAllArea(Long.valueOf(matcher.group()));
        matcher = pattern.matcher(s[5]);
        if(matcher.find()) info.setCanSellArea(Long.valueOf(matcher.group()));
        matcher = pattern.matcher(s[6]);
        if(matcher.find()) info.setIsSellNum(Integer.valueOf(matcher.group()));
        matcher = pattern.matcher(s[7]);
        if(matcher.find()) info.setIsSellArea(Long.valueOf(matcher.group()));
        System.out.println(info.toString());

        houseInfoMapper.insert(info);
        LOGGER.info("保存全市楼盘信息");
        LOGGER.info(info);
    }
}
