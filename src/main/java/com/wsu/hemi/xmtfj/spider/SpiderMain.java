package com.wsu.hemi.xmtfj.spider;

import com.geccocrawler.gecco.GeccoEngine;
import com.geccocrawler.gecco.pipeline.PipelineFactory;
import com.geccocrawler.gecco.request.HttpGetRequest;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

/**
 * Created by yexq on 2017/6/7.
 */
@Service
public class SpiderMain implements ApplicationContextAware,InitializingBean {

    private ApplicationContext context;

    public void afterPropertiesSet() throws Exception {
        PipelineFactory springPipelineFactory = (PipelineFactory)context.getBean("springPipelineFactory");

        //爬取日交易数据
        HttpGetRequest start = new HttpGetRequest("http://cloud.xm.gov.cn:88/xmzf/zf/newspfj.jsp");
        start.setCharset("UTF-8");
        GeccoEngine.create()
                .classpath("com.wsu.hemi.xmtfj.spider")
                .pipelineFactory(springPipelineFactory)
                .interval(2000)
                .start(start)
                .run();
        //爬取全市楼盘信息
        HttpGetRequest start2 = new HttpGetRequest("http://cloud.xm.gov.cn:88/xmzf/zf/newspfl.jsp");
        start2.setCharset("UTF-8");
        GeccoEngine.create()
                .classpath("com.wsu.hemi.xmtfj.spider")
                .pipelineFactory(springPipelineFactory)
                .interval(2000)
                .start(start2)
                .run();
        //爬取存量房成交数据
        HttpGetRequest start3 = new HttpGetRequest("http://cloud.xm.gov.cn:88/xmzf/zf/newclf.jsp");
        start3.setCharset("UTF-8");
        GeccoEngine.create()
                .classpath("com.wsu.hemi.xmtfj.spider")
                .pipelineFactory(springPipelineFactory)
                .interval(2000)
                .start(start3)
                .run();
    }

    public void setApplicationContext(ApplicationContext context) throws BeansException {
        this.context = context;
    }

    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-context.xml");
        System.in.read();
        context.close();
    }
}
