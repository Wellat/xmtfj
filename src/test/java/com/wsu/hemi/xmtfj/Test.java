package com.wsu.hemi.xmtfj;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by yexq on 2017/6/8.
 */
public class Test {
    public static void main(String args[]){
        String str="数据截止至2017-6-5 23:30:24· 在售楼盘总\n";
        String str2="<td valign=\"top\" width=\"50%\" class=\"pad5\">· 二手房今日成交<br> · 住宅面积比例：57%<br> · 成交住宅套数：36<br> · 今日成交套数：69</td>" +
                "<td valign=\"top\" width=\"50%\" class=\"pad5\">· 成交住宅面积（M<sup>2</sup>）：3470.19<br> · 今日成交面积（M<sup>2</sup>）：6095.78<br></td>\n";
        int[] ans = new int[3];
        String[] s = str2.split("：");

        Pattern pattern = Pattern.compile("(\\d+(\\.\\d+)*)");
        Pattern datePattern = Pattern.compile("([0-9]{4}-[0-9]{1,2}-[0-9]{1,2} [0-9]{2}:[0-9]{1,2}:[0-9]{1,2})");
        Matcher m = datePattern.matcher(str);
        if(m.find()){
            System.out.println(m.group());
        }

        for(int i=1;i<s.length;i++){
            Matcher matcher= pattern.matcher(s[i]);
            if(matcher.find()){
                System.out.println(matcher.group());
            }
        }


        System.out.println();
    }
}
