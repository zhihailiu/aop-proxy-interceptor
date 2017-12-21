package com.acme.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.acme.demo.domain.Customer;
import com.acme.demo.domain.Person;

@SpringBootApplication
public class AopProxyInterceptorApplication implements CommandLineRunner {

	private static final Logger LOGGER = LoggerFactory.getLogger(AopProxyInterceptorApplication.class);

	@Autowired
	private Person person;
	
	@Autowired
	private Customer customer;

	public static void main(String[] args) {
		SpringApplication.run(AopProxyInterceptorApplication.class, args);
	}

	@Override
	public void run(String... arg0) throws Exception {
		String msg = this.person.sayHello();
		LOGGER.debug(msg);
		
		String echo = this.customer.echo("you too");
		LOGGER.debug(echo);
	}
	
	
}
