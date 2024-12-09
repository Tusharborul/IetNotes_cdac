package com.demo.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.beans.Product;

public class TestProtoType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx=new ClassPathXmlApplicationContext("springconfig.xml");
		Product p= (Product) ctx.getBean("p1");
		System.out.println(p);
	}

}
