package com.wsu.hemi.xmtfj.spider;

import com.geccocrawler.gecco.pipeline.Pipeline;
import com.wsu.hemi.xmtfj.dao.OldHouseInfoMapper;
import com.wsu.hemi.xmtfj.entity.OldHouseInfo;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by yexq on 2017/6/8.
 */
@Service("saveOldHouseInfo")
public class SaveOldHouseInfo implements Pipeline<OldHouseInfos> {
    private static final Logger LOGGER = Logger.getLogger(SaveTransactionInfo.class);

    @Autowired
    OldHouseInfoMapper oldHouseInfoMapper;
    @Override
    public void process(OldHouseInfos oldHouseInfo) {
        List<String> stringList = oldHouseInfo.getStr();

        OldHouseInfo info = new OldHouseInfo();

        String[] s = stringList.get(0).split("：");
        Pattern pattern = Pattern.compile("(\\d+(\\.\\d+)*)");
        Matcher matcher= pattern.matcher(s[1]);
        if(matcher.find()){
            info.setHouseRate(Float.valueOf(matcher.group()));
        }
        matcher = pattern.matcher(s[2]);
        if(matcher.find()) info.setSellNum(Integer.valueOf(matcher.group()));
        matcher = pattern.matcher(s[3]);
        if(matcher.find()) info.setTodaySellNum(Integer.valueOf(matcher.group()));
        matcher = pattern.matcher(s[4]);
        if(matcher.find()) info.setSellArea(Float.valueOf(matcher.group()));
        matcher = pattern.matcher(s[5]);
        if(matcher.find()) info.setTodaySellArea(Float.valueOf(matcher.group()));

        Date beginDate = new Date();
        Calendar date = Calendar.getInstance();
        date.setTime(beginDate);
        date.set(Calendar.DATE, date.get(Calendar.DATE) - 1);
        info.setDate(date.getTime());
        System.out.println(info.toString());
        oldHouseInfoMapper.insert(info);
        LOGGER.info("保存二手房交易数据");
    }
}
