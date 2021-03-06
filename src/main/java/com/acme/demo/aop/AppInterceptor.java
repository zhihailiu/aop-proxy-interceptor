package com.acme.demo.aop;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component(value = "appInterceptor")
public class AppInterceptor implements MethodInterceptor {

	private static final Logger LOGGER = LoggerFactory.getLogger(AppInterceptor.class);

	@Override
	public Object invoke(MethodInvocation mi) throws Throwable {
		LOGGER.debug("invoke:{}", mi.getMethod().getName());
		// do something here
		return mi.proceed();
	}

}
