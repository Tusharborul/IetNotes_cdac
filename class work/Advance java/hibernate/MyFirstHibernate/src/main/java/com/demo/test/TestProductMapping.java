package com.demo.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.beans.Product;
import com.demo.beans.Student;

public class TestProductMapping {

	public static void main(String[] args) {
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		Session session=sf.openSession();
		Transaction tr=session.beginTransaction();
		Product p1=new Product("chair",2,3000);
		Product p2=new Product("table",5,5000);
		Product p3=new Product("dask",10,7000);

		session.save(p1);
		session.save(p2);
		session.save(p3);
		tr.commit();
		session.close();
		sf.close();
		

	}

}
