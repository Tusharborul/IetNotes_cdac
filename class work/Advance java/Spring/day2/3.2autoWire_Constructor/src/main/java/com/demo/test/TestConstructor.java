package com.demo.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.beans.Order;

public class TestConstructor {

	public static void main(String[] args) {
		ApplicationContext  ctx=new ClassPathXmlApplicationContext("springconfig.xml");
		Order o=(Order) ctx.getBean("o");
		System.out.println(o);
	}

}
