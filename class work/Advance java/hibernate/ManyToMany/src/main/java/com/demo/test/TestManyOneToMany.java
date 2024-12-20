package com.demo.test;

import java.util.HashSet;
import java.util.Set;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import com.demo.beans.Course;
import com.demo.beans.Student;

public class TestManyOneToMany {

	public static void main(String[] args) {
		SessionFactory sf= new Configuration().configure().buildSessionFactory();
		
		
		Course c1 = new Course();
		c1.setCname("JAVA");
		Course c2 = new Course();
		c2.setCname("Advance JAVA");
		Course c3= new Course();
		c3.setCname("JAVA DSA");
		
		
		Student s1= new Student();
		Student s2= new Student();
		Student s3= new Student();
		s1.setSname("ram");
		s2.setSname("shram");
		s3.setSname("raghav");
		
		Set<Course> clist1=new HashSet<>();
		clist1.add(c1);
		clist1.add(c2);
		
		Set<Course> clist2=new HashSet<>();
		clist2.add(c1);
		clist2.add(c3);
		
		Set<Course> clist3=new HashSet<>();
		clist3.add(c3);
		clist3.add(c2);
		
		
		Set<Student> slist1= new HashSet<Student>();	
		slist1.add(s1);
		slist1.add(s2);
		
		Set<Student> slist2= new HashSet<Student>();
		slist2.add(s1);
		slist2.add(s3);
		
		Set<Student> slist3= new HashSet<Student>();	
		slist3.add(s3);
		slist3.add(s2);
		
		c1.setSlist(slist1);
		c2.setSlist(slist2);
		c3.setSlist(slist3);
		
		s1.setClist(clist1);
		s2.setClist(clist2);
		s3.setClist(clist3);
		
		
		Session sess= sf.openSession();
		Transaction tr = sess.beginTransaction();
		
		
		sess.save(c1);
		sess.save(c2);
		sess.save(c3);
		sess.save(s1);
		sess.save(s2);
		sess.save(s3);
		
		tr.commit();
		sess.close();
		sf.close();
	}

}
