package com.wsu.hemi.xmtfj.spider;

import com.geccocrawler.gecco.GeccoEngine;
import com.geccocrawler.gecco.annotation.Gecco;
import com.geccocrawler.gecco.annotation.HtmlField;
import com.geccocrawler.gecco.request.HttpGetRequest;
import com.geccocrawler.gecco.spider.HtmlBean;

import java.util.List;

/**
 * 全市楼盘信息
 */
@Gecco(matchUrl="http://cloud.xm.gov.cn:88/xmzf/zf/newspfl.jsp", pipelines={"consolePipeline","saveHouseInfo"})
public class HouseInfos implements HtmlBean {
    private static final long serialVersionUID = 665662335318691818L;
    public static void main(String[] args) {
        HttpGetRequest start = new HttpGetRequest("http://cloud.xm.gov.cn:88/xmzf/zf/newspfl.jsp");
        start.setCharset("UTF-8");
        GeccoEngine.create()
                .classpath("com.wsu.hemi.xmtfj.spider")
                .start(start)
                .run();
    }
    @HtmlField(cssPath="body > table > tbody > tr")
    private List<String> str;

    public List<String> getStr() {
        return str;
    }

    public void setStr(List<String> str) {
        this.str = str;
    }

}