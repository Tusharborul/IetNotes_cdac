package com.demo.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.beans.Product;
import com.demo.beans.Student;

public class TestStudentProdAnnotation {

	public static void main(String[] args) {
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		Session session1=sf.openSession();
		Transaction tr1=session1.beginTransaction();
//		
//		Student s1=new Student("Anil","4444",97);
//		Student s2=new Student("Vandana","5555",97);
//		session1.save(s1);
//		session1.save(s2);
//		tr1.commit();
//		session1.close();
//		sf.close();
//		
	
	
		System.out.println("before get method");
		Product pp1=session1.get(Product.class,2);
		//Product pp1=session1.load(Product.class,2);
		System.out.println("After get method");
		System.out.println(pp1);
		tr1.commit();
		session1.close();
		sf.close();
		
		

	}

}
