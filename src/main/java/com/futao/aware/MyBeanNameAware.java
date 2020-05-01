package com.futao.aware;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.stereotype.Component;

/**
 * 感知自己在Spring容器中的名字
 *
 * @author futao
 * @date 2020/5/1
 */
@Component
public class MyBeanNameAware implements BeanNameAware {
	@Override
	public void setBeanName(String name) {
		System.out.println("我的名字是:" + name);
	}
}
