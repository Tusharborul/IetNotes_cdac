package com.demo.test;
import com.demo.beans.Order;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.beans.Product;

public class TestByType {

	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("springconfig.xml");
		Order o=(Order) ctx.getBean("o");
		System.out.println(o);
	}

}