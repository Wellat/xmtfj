package com.wsu.hemi.xmtfj.spider;

import com.geccocrawler.gecco.GeccoEngine;
import com.geccocrawler.gecco.annotation.Gecco;
import com.geccocrawler.gecco.annotation.HtmlField;
import com.geccocrawler.gecco.request.HttpGetRequest;
import com.geccocrawler.gecco.spider.HtmlBean;
import com.sun.tools.corba.se.idl.StringGen;

import java.util.List;

/**
 * 二手房成交数据
 */
@Gecco(matchUrl="http://cloud.xm.gov.cn:88/xmzf/zf/newclf.jsp", pipelines={"consolePipeline","saveOldHouseInfo"})
public class OldHouseInfos implements HtmlBean {
    private static final long serialVersionUID = 665662335318691818L;
    public static void main(String[] args) {
        HttpGetRequest start = new HttpGetRequest("http://cloud.xm.gov.cn:88/xmzf/zf/newclf.jsp");
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