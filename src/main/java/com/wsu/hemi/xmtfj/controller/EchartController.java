package com.wsu.hemi.xmtfj.controller;

import com.alibaba.fastjson.JSON;
import com.wsu.hemi.xmtfj.entity.TransactionInfo;
import com.wsu.hemi.xmtfj.service.SpfService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Hemi on 2017/6/9.
 */
@RequestMapping("/index")
@Controller
public class EchartController {
    @Autowired
    SpfService spfService;

    @ResponseBody
    @RequestMapping(value = "/spf/{area}")
    public Map<String,Object> getSpf(@PathVariable String area, HttpServletRequest request){
        Map<String,Object> map = new HashMap<>();
        System.out.println("-------"+area);
        if(area.isEmpty() || area.equals("")){
            map.put("state",false);
            map.put("msg","输入数据为空");
            return map;
        }

        List<Date> date = spfService.getAxisData();
        String[] dates = new String[date.size()];
        for(int i=0;i<date.size();i++){
            dates[i]=(new SimpleDateFormat("yyyy/MM/dd").format(date.get(i)));
        }
        List<TransactionInfo> infoList;
        if(area.equals("厦门市")){
            infoList = spfService.getAllRegion();
        }else {
            infoList = spfService.getByRegion(area);
        }
        int[] totalSum = new int[infoList.size()];
        int[] sellSum = new int[infoList.size()];
        float[] sellArea = new float[infoList.size()];
        float[] totalArea = new float[infoList.size()];

        for(int i=0;i<infoList.size();i++){
            totalArea[i] = infoList.get(i).getTotalArea();
            totalSum[i] = infoList.get(i).getTotalSum();
            sellSum[i] = infoList.get(i).getSellSum();
            sellArea[i] = infoList.get(i).getSellArea();
        }
        map.put("axis",dates);
        map.put("state",true);
        map.put("totalSum",totalSum);
        map.put("sellSum",sellSum);
        map.put("sellArea",sellArea);
        map.put("totalArea",totalArea);
        return map;
    }
}
