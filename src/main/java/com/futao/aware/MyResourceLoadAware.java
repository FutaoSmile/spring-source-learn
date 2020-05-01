package com.futao.aware;

import org.springframework.context.ResourceLoaderAware;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Component;

/**
 * @author futao
 * @date 2020/5/1
 */
@Component
public class MyResourceLoadAware implements ResourceLoaderAware {
	@Override
	public void setResourceLoader(ResourceLoader resourceLoader) {
		System.out.println("ResourceLoaderAware...resourceLoader..." + resourceLoader.getClassLoader());
	}
}
