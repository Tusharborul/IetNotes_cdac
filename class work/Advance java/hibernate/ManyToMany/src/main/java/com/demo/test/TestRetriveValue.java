package com.demo.test;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.demo.beans.Course;
import com.demo.beans.Student;

public class TestRetriveValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory sf= new Configuration().configure().buildSessionFactory();
		Session sess= sf.openSession();
		
		Student s1= sess.get(Student.class,1);
//		System.out.println(s1.getSname());
//		System.out.println(s1);
		Set<Course> clist1=new HashSet<>();
		clist1=s1.getClist();
		System.out.println(clist1);
	
	}

}
