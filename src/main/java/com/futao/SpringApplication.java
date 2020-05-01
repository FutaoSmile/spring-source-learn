package com.futao;

import com.futao.aop.enhance.Say;
import com.futao.controller.WelcomeController;
import com.futao.service.WelcomeService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * @author futao
 * @date 2020/5/1
 */
@ComponentScan("com.futao")
@Configuration
@EnableAspectJAutoProxy()
public class SpringApplication {

	public static void main(String[] args) {
//		baseXml();
		baseAnno();
	}

	public static void baseXml() {
		FileSystemXmlApplicationContext applicationContext = new FileSystemXmlApplicationContext("classpath:spring-config.xml");
		System.out.println(applicationContext.getBean("user1"));
		System.out.println(applicationContext.getBean("user1"));

		System.out.println(applicationContext.getBean("user2"));
		System.out.println(applicationContext.getBean("user2"));

		System.out.println(applicationContext.getBean("user3"));
		System.out.println(applicationContext.getBean("user3"));

		System.out.println(applicationContext.getBean("userFactoryBean"));
		System.out.println(applicationContext.getBean("userFactoryBean"));

		//如果要获取UserFactoryBean的实例
		System.out.println(applicationContext.getBean("&userFactoryBean"));
		System.out.println(applicationContext.getBean("&userFactoryBean"));

		System.out.println(applicationContext.getBean("userByBeanDefinitionRegistryPostProcessor"));
		System.out.println(applicationContext.getBean("userByBeanDefinitionRegistryPostProcessor"));


		WelcomeController welcomeController = applicationContext.getBean(WelcomeController.class);
		welcomeController.handleRequest();


	}

	public static void baseAnno() {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringApplication.class);
		for (String beanDefinitionName : applicationContext.getBeanDefinitionNames()) {
			System.out.println(beanDefinitionName);
		}

		WelcomeService welcomeService = applicationContext.getBean(WelcomeService.class);
		welcomeService.sayHello("韬哥");

		WelcomeController welcomeController = (WelcomeController) applicationContext.getBean("welcomeController");
		welcomeController.handleRequest();


		Say controller = (Say) welcomeController;
		controller.introduceSelf();

	}

}
