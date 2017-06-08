package com.wsu.hemi.xmtfj.spider;

import com.alibaba.fastjson.JSON;
import com.geccocrawler.gecco.pipeline.Pipeline;
import com.geccocrawler.gecco.spider.SpiderBean;
import org.springframework.stereotype.Service;

@Service("consolePipeline")
public class ConsolePipeline implements Pipeline<SpiderBean> {

	public void process(SpiderBean bean) {
		System.out.println("-----consolePipeline----");
		System.out.println(JSON.toJSONString(bean));
	}

}
