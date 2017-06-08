package com.wsu.hemi.xmtfj.spider;

import com.geccocrawler.gecco.pipeline.Pipeline;
import com.wsu.hemi.xmtfj.dao.TransactionInfoMapper;
import com.wsu.hemi.xmtfj.entity.TransactionInfo;
import com.wsu.hemi.xmtfj.utils.TipException;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

/**
 * Created by yexq on 2017/6/7.
 */
@Service("saveTransactionInfo")
public class SaveTransactionInfo implements Pipeline<Transaction> {
    private static final Logger LOGGER = Logger.getLogger(SaveTransactionInfo.class);

    @Autowired
    TransactionInfoMapper infoMapper;

    public void process(Transaction bean) {
        List<DataTemp> originData = bean.getTransaction();
        if(originData.size()<5){
            LOGGER.error("获取的交易数据有误");
            throw new TipException("获取的交易数据有误");
        }
        List<List<String>> data = new ArrayList<>();
        for(int i=0;i<originData.size();i++){
            List<String> temp = new ArrayList<>();
//            temp.add(originData.get(i).getS1());
            temp.add(originData.get(i).getS2());
            temp.add(originData.get(i).getS3());
            temp.add(originData.get(i).getS4());
            temp.add(originData.get(i).getS5());
            temp.add(originData.get(i).getS6());
            temp.add(originData.get(i).getS7());
            data.add(temp);
        }
        for (int i = 0; i < 6; i++) {
            TransactionInfo info = new TransactionInfo();

            info.setRegion(data.get(0).get(i));
            info.setSellSum(Integer.valueOf(data.get(1).get(i)));
            info.setSellArea(Float.valueOf(data.get(2).get(i)));
            info.setTotalSum(Integer.valueOf(data.get(3).get(i)));
            info.setTotalArea(Float.valueOf(data.get(4).get(i)));

            Date beginDate = new Date();
            Calendar date = Calendar.getInstance();
            date.setTime(beginDate);
            date.set(Calendar.DATE, date.get(Calendar.DATE) - 1);
            info.setDate(date.getTime());

            infoMapper.insert(info);
        }
        LOGGER.info("交易数据保存成功");
    }

}
