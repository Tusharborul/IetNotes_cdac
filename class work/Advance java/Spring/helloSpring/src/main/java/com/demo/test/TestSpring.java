package com.demo.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.beans.SpringFirst;

public class TestSpring {

	public static void main(String[] args) {
		ApplicationContext ac= new ClassPathXmlApplicationContext("springconfig.xml");
		SpringFirst first= (SpringFirst) ac.getBean("hwbean");
		first.sayHello();

	}

}
