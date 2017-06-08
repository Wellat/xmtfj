package com.wsu.hemi.xmtfj.spider;

import com.geccocrawler.gecco.GeccoEngine;
import com.geccocrawler.gecco.annotation.Gecco;
import com.geccocrawler.gecco.annotation.HtmlField;
import com.geccocrawler.gecco.annotation.Request;
import com.geccocrawler.gecco.request.HttpGetRequest;
import com.geccocrawler.gecco.request.HttpRequest;
import com.geccocrawler.gecco.spider.HtmlBean;

import java.util.List;

/**
 * Created by yexq on 2017/6/7.
 */
@Gecco(matchUrl="http://cloud.xm.gov.cn:88/xmzf/zf/newspfj.jsp", pipelines={"consolePipeline","saveTransactionInfo"})
public class Transaction implements HtmlBean {
    private static final long serialVersionUID = 665662335318691818L;
    public static void main(String[] args) {
        HttpGetRequest start = new HttpGetRequest("http://cloud.xm.gov.cn:88/xmzf/zf/newspfj.jsp");
        start.setCharset("UTF-8");
        GeccoEngine.create()
                .classpath("com.wsu.hemi.xmtfj.spider")
                .start(start)
                .run();
    }

    @Request
    private HttpRequest request;


    @HtmlField(cssPath="body > table > tbody > tr")
    private List<DataTemp> transaction;

    public HttpRequest getRequest() {
        return request;
    }

    public void setRequest(HttpRequest request) {
        this.request = request;
    }

    public List<DataTemp> getTransaction() {
        return transaction;
    }

    public void setTransaction(List<DataTemp> transaction) {
        this.transaction = transaction;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "request=" + request +
                ", transaction=" + transaction +
                '}';
    }
}
