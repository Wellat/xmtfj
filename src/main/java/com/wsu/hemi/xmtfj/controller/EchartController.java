package com.wsu.hemi.xmtfj.controller;

import com.wsu.hemi.xmtfj.entity.HouseInfo;
import com.wsu.hemi.xmtfj.entity.NameValue;
import com.wsu.hemi.xmtfj.entity.OldHouseInfo;
import com.wsu.hemi.xmtfj.entity.TransactionInfo;
import com.wsu.hemi.xmtfj.service.HouseService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Created by Hemi on 2017/6/9.
 */
@RequestMapping("/index")
@Controller
public class EchartController {
    private static final Logger LOGGER = Logger.getLogger(EchartController.class);

    @Autowired
    HouseService houseService;


    @RequestMapping(value = "")
    public String index(HttpServletRequest request) {
        HouseInfo houseInfo = houseService.getNewestHouseInfo();
        request.setAttribute("houseInfo", houseInfo);
        return "show";
    }

    /**
     * 图4
     *
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/esf", method = RequestMethod.GET)
    public Map<String, Object> esf() {
        LOGGER.info("-----------------------esf controller------------------------------");
        Map<String, Object> map = new HashMap<>();
        List<OldHouseInfo> oldHouseInfoList = houseService.getOldHouseInfo();

        List<Integer> esf_houseNum = new ArrayList<>();
        List<Integer> esf_totalNum = new ArrayList<>();

        List<String> esf_date = new ArrayList<>();

        for (int i = 0; i < oldHouseInfoList.size(); i++) {
            esf_houseNum.add(oldHouseInfoList.get(i).getSellNum());
            esf_totalNum.add(oldHouseInfoList.get(i).getTodaySellNum());
            SimpleDateFormat spf = new SimpleDateFormat("yyyy/MM/dd");
            esf_date.add(spf.format(oldHouseInfoList.get(i).getDate()));
        }
        map.put("state",true);
        map.put("esfHouseNum",esf_houseNum);
        map.put("esfTotalNum",esf_totalNum);
        map.put("esfDate",esf_date);
        return map;
    }

    /**
     * 图1-图2
     *
     * @param period
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/spfp/{period}", method = RequestMethod.GET)
    public Map<String, Object> spfP(@PathVariable String period) {
        LOGGER.debug(period);
        Map<String, Object> map = new HashMap<>();
        int selectNum = Integer.valueOf(period) / 10;
        List<TransactionInfo> infoList = houseService.getHotSpfBylimit(selectNum * 6);

        List<NameValue> nameValues_sum = new ArrayList<>();
        List<NameValue> nameValues_area = new ArrayList<>();
        for (int i = 0; i < infoList.size(); i++) {
            NameValue nv_sum = new NameValue();
            NameValue nv_area = new NameValue();
            nv_sum.setName(infoList.get(i).getRegion());
            nv_sum.setValue(infoList.get(i).getSellSum());

            nv_area.setName(infoList.get(i).getRegion());
            nv_area.setValue(infoList.get(i).getSellArea());

            nameValues_area.add(nv_area);
            nameValues_sum.add(nv_sum);
        }
        map.put("state", true);
        map.put("nvSum", nameValues_sum);
        map.put("nvArea", nameValues_area);

        return map;
    }


    /**
     * 图3
     *
     * @param area
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/spfa/{area}", method = RequestMethod.GET)
    public Map<String, Object> getSpf(@PathVariable String area) {
        LOGGER.debug(area);
        Map<String, Object> map = new HashMap<>();
        if (area.isEmpty() || area.equals("")) {
            map.put("state", false);
            map.put("msg", "输入数据为空");
            return map;
        }

        List<Date> date = houseService.getAxisData();
        String[] dates = new String[date.size()];
        for (int i = 0; i < date.size(); i++) {
            dates[i] = (new SimpleDateFormat("yyyy/MM/dd").format(date.get(i)));
        }
        List<TransactionInfo> infoList;
        if (area.equals("厦门市")) {
            infoList = houseService.getAllRegion();
        } else {
            infoList = houseService.getByRegion(area);
        }
        int[] totalSum = new int[infoList.size()];
        int[] sellSum = new int[infoList.size()];
        float[] sellArea = new float[infoList.size()];
        float[] totalArea = new float[infoList.size()];

        for (int i = 0; i < infoList.size(); i++) {
            totalArea[i] = infoList.get(i).getTotalArea();
            totalSum[i] = infoList.get(i).getTotalSum();
            sellSum[i] = infoList.get(i).getSellSum();
            sellArea[i] = infoList.get(i).getSellArea();
        }
        map.put("axis", dates);
        map.put("state", true);
        map.put("totalSum", totalSum);
        map.put("sellSum", sellSum);
        map.put("sellArea", sellArea);
        map.put("totalArea", totalArea);
        return map;
    }
}
