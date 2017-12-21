package com.acme.demo.config;

import org.springframework.aop.framework.ProxyFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.acme.demo.domain.Customer;

@Configuration
public class CustomerConfig {

    @Bean
    @Primary
    public ProxyFactoryBean customerProxy() {
        ProxyFactoryBean pfb = new ProxyFactoryBean();
        pfb.setTarget(this.customer());
        pfb.setInterceptorNames("appInterceptor");
        pfb.setProxyTargetClass(true);
        return pfb;
    }

    @Bean
    public Customer customer() {
    	return new Customer();
    }
    
}
