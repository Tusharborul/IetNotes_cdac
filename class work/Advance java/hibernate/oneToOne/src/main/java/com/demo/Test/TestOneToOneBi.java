package com.demo.Test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.beans.Course;
import com.demo.beans.Faculty;


public class TestOneToOneBi {

	public static void main(String[] args) {
		
	SessionFactory sf= new Configuration().configure().buildSessionFactory();
	
	Course c=new Course(); 
	c.setCname("java"); 
	 Faculty f=new Faculty("rahul",c);
	 c.setF(f); 
	 Session sess=sf.openSession(); 
	 Transaction tr=sess.beginTransaction();
	 sess.save(c);
	 sess.save(f); 
	 tr.commit(); 
	 sess.close();
	
	
	}

}
