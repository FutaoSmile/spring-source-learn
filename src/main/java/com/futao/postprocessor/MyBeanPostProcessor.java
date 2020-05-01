package com.futao.postprocessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

/**
 * @author futao
 * @date 2020/5/1
 */
@Component
public class MyBeanPostProcessor implements BeanPostProcessor {

	/**
	 * Bean初始化之前
	 *
	 * @param bean     the new bean instance
	 * @param beanName the name of the bean
	 * @return
	 * @throws BeansException
	 */
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println(beanName + "调用了postProcessBeforeInitialization");
		return bean;
	}

	/**
	 * Bean初始化好了之后
	 *
	 * @param bean     the new bean instance
	 * @param beanName the name of the bean
	 * @return
	 * @throws BeansException
	 */
	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println(beanName + "调用了postProcessAfterInitialization");
		return bean;
	}
}
