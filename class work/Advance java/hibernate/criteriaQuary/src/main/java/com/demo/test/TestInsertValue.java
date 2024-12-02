package com.demo.test;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.beans.Product;

public class TestInsertValue {

	public static void main(String[] args) {
		SessionFactory sf= new Configuration().configure().buildSessionFactory();
		
		Product p1= new Product("Chair",20,2000);
		Product p2= new Product("Desk",30,5000);
		Product p3= new Product("Table",10,4500);
		Product p4= new Product("Sofa",12,8999);
		
		Session sess=sf.openSession();
		Transaction tr=sess.beginTransaction();
		sess.save(p1);
		sess.save(p2);
		sess.save(p3);
		sess.save(p4);
		tr.commit();
		sess.close();
		sf.close();
	}

}
