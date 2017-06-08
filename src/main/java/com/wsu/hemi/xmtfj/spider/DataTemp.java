package com.wsu.hemi.xmtfj.spider;

import com.geccocrawler.gecco.annotation.HtmlField;
import com.geccocrawler.gecco.annotation.Text;
import com.geccocrawler.gecco.spider.HtmlBean;

/**
 * Created by yexq on 2017/6/7.
 */
public class DataTemp implements HtmlBean {
    private static final long serialVersionUID = 665662335318691818L;
    @Text
    @HtmlField(cssPath="td:nth-child(1)")
    private String s1;

    @Text
    @HtmlField(cssPath="td:nth-child(2)")
    private String s2;

    @Text
    @HtmlField(cssPath="td:nth-child(3)")
    private String s3;

    @Text
    @HtmlField(cssPath="td:nth-child(4)")
    private String s4;

    @Text
    @HtmlField(cssPath="td:nth-child(5)")
    private String s5;

    @Text
    @HtmlField(cssPath="td:nth-child(6)")
    private String s6;

    @Text
    @HtmlField(cssPath="td:nth-child(7)")
    private String s7;

    public String getS1() {
        return s1;
    }

    public void setS1(String s1) {
        this.s1 = s1;
    }

    public String getS2() {
        return s2;
    }

    public void setS2(String s2) {
        this.s2 = s2;
    }

    public String getS3() {
        return s3;
    }

    public void setS3(String s3) {
        this.s3 = s3;
    }

    public String getS4() {
        return s4;
    }

    public void setS4(String s4) {
        this.s4 = s4;
    }

    public String getS5() {
        return s5;
    }

    public void setS5(String s5) {
        this.s5 = s5;
    }

    public String getS6() {
        return s6;
    }

    public void setS6(String s6) {
        this.s6 = s6;
    }

    public String getS7() {
        return s7;
    }

    public void setS7(String s7) {
        this.s7 = s7;
    }
}
