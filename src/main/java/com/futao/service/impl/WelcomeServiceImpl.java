package com.futao.service.impl;

import com.futao.service.WelcomeService;
import org.springframework.stereotype.Service;

/**
 * @author futao
 * @date 2020/5/1
 */
@Service
public class WelcomeServiceImpl implements WelcomeService {

	@Override
	public void sayHello(String name) {
		System.out.println("你好a:" + name);
	}
}
