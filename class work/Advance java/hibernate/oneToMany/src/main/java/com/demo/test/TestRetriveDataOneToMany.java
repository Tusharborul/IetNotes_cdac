package com.demo.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.beans.Course;

public class TestRetriveDataOneToMany {

	public static void main(String[] args) {
		SessionFactory sf =new Configuration().configure().buildSessionFactory();
		Session sess= sf.openSession();
		
		
		System.out.println("before");
		System.out.println();
		System.out.println();
	//	Course c1= sess.load(Course.class,1);
		Course c2= sess.get(Course.class,2);
		System.out.println();
		System.out.println();
		System.out.println("After");
		System.out.println();
		System.out.println();
		
		//System.out.println(c1.getCname());
		System.out.println(c2.getCname());
		
	//	System.out.println(c1);
		System.out.println(c2);
		
		sess.close();
		sf.close();
				
	}

}
