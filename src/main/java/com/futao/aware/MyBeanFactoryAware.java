package com.futao.aware;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.stereotype.Component;

/**
 * @author futao
 * @date 2020/5/1
 */
@Component
public class MyBeanFactoryAware implements BeanFactoryAware {
	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		System.out.println(beanFactory.containsBean("user1"));
		System.out.println("获取到BeanFactoryAware...beanFactory" + beanFactory.toString());
	}
}
