package com.futao.aware;

import org.springframework.context.MessageSource;
import org.springframework.context.MessageSourceAware;

/**
 * @author futao
 * @date 2020/5/1
 */
public class MyMessageSourceAware implements MessageSourceAware {
	@Override
	public void setMessageSource(MessageSource messageSource) {
		System.out.println("MessageSourceAware..messageSource...");
	}
}
