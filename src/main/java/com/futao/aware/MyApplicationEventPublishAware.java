package com.futao.aware;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * @author futao
 * @date 2020/5/1
 */
@Component
public class MyApplicationEventPublishAware implements ApplicationEventPublisherAware, ApplicationListener<MyApplicationEventPublishAware.Ev> {


	private ApplicationEventPublisher applicationEventPublisher;

	@Override
	public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
		System.out.println("获取到applicationEventPublisher之后，就可以保存起来，以后通过这个对象来发布时间哟");
		this.applicationEventPublisher = applicationEventPublisher;
		System.out.println("ApplicationEventPublisherAware...applicationEventPublisher..");
	}

	public void publishEvent(Object event) {
		applicationEventPublisher.publishEvent(event);
	}

	@Override
	public void onApplicationEvent(Ev event) {
		System.out.println("我接受到了事件类型为Ev的事件，因为我监听了这类事件...");
	}


	public static class Ev extends ApplicationEvent {
		/**
		 * Create a new {@code ApplicationEvent}.
		 *
		 * @param source the object on which the event initially occurred or with
		 *               which the event is associated (never {@code null})
		 */
		public Ev(Object source) {
			super(source);
		}
	}
}
