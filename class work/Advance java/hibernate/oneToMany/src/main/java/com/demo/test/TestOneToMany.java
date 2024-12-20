package com.demo.test;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.beans.Course;
import com.demo.beans.Student;

public class TestOneToMany {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory sf= new Configuration().configure().buildSessionFactory();
		
		Course c1=new Course();
		c1.setCname("java");
		
		Student s1= new Student("tushar",c1);
		Student s2= new Student("prafull",c1);
		
		Set<Student> ss1 = new HashSet<>();
		ss1.add(s1);
		ss1.add(s2);
		
		
		Course c2=new Course();
		c2.setCname("React");
		
		Student s3= new Student("ram",c2);
		Student s4= new Student("sham",c2);
		
		Set<Student> ss2 = new HashSet<>();
		ss2.add(s3);
		ss2.add(s4);
		
		Session sess= sf.openSession();
		Transaction tr = sess.beginTransaction();
		
		sess.save(c1);
		sess.save(c2);
		sess.save(s1);
		sess.save(s2);
		sess.save(s3);
		sess.save(s4);
		
		tr.commit();
		sess.close();
		sf.close();
	}

}
