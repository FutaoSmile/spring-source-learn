package com.futao.aware;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.stereotype.Component;

/**
 * @author futao
 * @date 2020/5/1
 */
@Component
public class MyApplicationEventPublishAware implements ApplicationEventPublisherAware {
	@Override
	public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
		System.out.println("ApplicationEventPublisherAware...applicationEventPublisher..");
	}
}
