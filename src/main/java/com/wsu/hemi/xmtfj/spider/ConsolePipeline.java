package com.wsu.hemi.xmtfj.spider;

import com.alibaba.fastjson.JSON;
import com.geccocrawler.gecco.pipeline.Pipeline;
import com.geccocrawler.gecco.spider.SpiderBean;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

@Service("consolePipeline")
public class ConsolePipeline implements Pipeline<SpiderBean> {
	private static final Logger LOGGER = Logger.getLogger(ConsolePipeline.class);

	public void process(SpiderBean bean) {
		LOGGER.info(JSON.toJSONString(bean));
	}

}
