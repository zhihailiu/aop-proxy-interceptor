# Proxy interface/class to intercept methods with Spring AOP and Boot

* Spring Boot 1.5.9, Spring 4.3.13
* MethodInterceptor
* @Bean
* @Primary
* ProxyFactoryBean
* setProxyTargetClass(true)

## Use Case 1: Proxy class with interface
This is the most straightforward case. Proxy class, set target and interceptor. PersonConfig is the example in code.

## Use Case 2: Proxy class without interface
Same as Use case 1, but need to set proxyTargetClass to true. CustomerConfig is the example in code.

## Use Case 3: Proxy class with interface AND its own methods
Depending on the method to intercept. If the method is defined in interface, then it is the same as Use Case 1. If the method is no defined in interface but rather the class itself, then it is the same as Use Case 2.
