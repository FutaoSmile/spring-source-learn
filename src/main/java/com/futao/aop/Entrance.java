package com.futao.aop;

import com.futao.aop.enhance.Say;
import com.futao.aop.enhance.impl.SayImpl;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareAnnotation;
import org.aspectj.lang.annotation.DeclareParents;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

/**
 * @author futao
 * @date 2020/5/1
 */
@Aspect
@Component
public class Entrance {
	public Entrance() {
		System.out.println("----------entrance");
	}

	/**
	 * 使得该包下的类都实现Say这个接口
	 */
	@DeclareParents(value = "com.futao.controller..*", defaultImpl = SayImpl.class)
	public static Say sayEnhance;

	/**
	 * Spring似乎没有实现
	 */
	@DeclareAnnotation("com.futao.controller..*")
	@Lazy(true)
	public static Object object;


}
