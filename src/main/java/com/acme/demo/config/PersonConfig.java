package com.acme.demo.config;

import org.springframework.aop.framework.ProxyFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.acme.demo.domain.Person;
import com.acme.demo.domain.Person1;

@Configuration
public class PersonConfig {

    @Bean
    @Primary
    public ProxyFactoryBean personProxy() {
        ProxyFactoryBean pfb = new ProxyFactoryBean();
        pfb.setTarget(this.person());
        pfb.setInterceptorNames("appInterceptor");
        return pfb;
    }
    
    @Bean
    public Person person() {
    	return new Person1();
    }

}
