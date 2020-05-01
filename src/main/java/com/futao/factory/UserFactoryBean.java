package com.futao.factory;

import com.futao.entity.User;
import org.springframework.beans.factory.FactoryBean;

/**
 * @author futao
 * @date 2020/5/1
 */
public class UserFactoryBean implements FactoryBean<User> {
	@Override
	public User getObject() throws Exception {
		return new User();
	}

	@Override
	public Class<?> getObjectType() {
		return User.class;
	}
}
