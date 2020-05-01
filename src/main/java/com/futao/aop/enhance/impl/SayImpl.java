package com.futao.aop.enhance.impl;

import com.futao.aop.enhance.Say;

/**
 * @author futao
 * @date 2020/5/1
 */
public class SayImpl implements Say {
	@Override
	public void introduceSelf() {
		System.out.println("我是" + this.getClass().getName() + ",我被赋予了自我介绍的能力");
	}
}
