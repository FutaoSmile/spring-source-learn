package com.futao.aware;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * @author futao
 * @date 2020/5/1
 */
@Component
public class MyApplicationContextAware implements ApplicationContextAware {
	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		String applicationName = applicationContext.getApplicationName();
		System.out.println("获取到ApplicationContext:" + applicationName);
	}
}
