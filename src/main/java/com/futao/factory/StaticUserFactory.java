package com.futao.factory;

import com.futao.entity.User;

/**
 * @author futao
 * @date 2020/5/1
 */
public class StaticUserFactory {

	public static User getUser() {
		return new User();
	}
}
