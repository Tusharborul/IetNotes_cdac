package com.demo.SpringBootHelloMVC;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootHelloMvcApplication {

	public static void main(String[] args) {
		ApplicationContext ctx= SpringApplication.run(SpringBootHelloMvcApplication.class, args);
		String[] str= ctx.getBeanDefinitionNames();
		for (String beanName : str) { 
			System.out.println(beanName); 
		}
		System.out.println("hi");
	}

}
