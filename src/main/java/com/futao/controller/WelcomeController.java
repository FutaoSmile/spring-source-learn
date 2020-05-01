package com.futao.controller;

import com.futao.service.WelcomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * @author futao
 * @date 2020/5/1
 */
@Controller
public class WelcomeController {

	@Autowired
	private WelcomeService welcomeService;

	public void handleRequest() {
		welcomeService.sayHello("来自controller的问候");
	}
	
}
