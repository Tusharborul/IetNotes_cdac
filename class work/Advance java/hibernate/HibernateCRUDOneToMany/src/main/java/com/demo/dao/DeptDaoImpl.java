package com.demo.dao;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.demo.beans.Department;

public class DeptDaoImpl implements DeptDao{
   static SessionFactory sf;
   
   static {
	   sf=HibernateUtil.getMyConnection();
   }
@Override
public void saveDepartment(Department d) {
	Session sess=sf.openSession();
	Transaction tr=sess.beginTransaction();
	sess.save(d);
	tr.commit();
	sess.close();
	
}

public boolean removeById(int did) {
	Session sess=sf.openSession();
	Transaction tr=sess.beginTransaction();
	Department d=sess.get(Department.class, did);
	boolean status=false;
	if(d!=null) {
		sess.delete(d);
		status=true;
	}
	tr.commit();
	sess.close();
	return status;
}

@Override
public boolean modifyById(int did, String dname, String dloc) {
	// TODO Auto-generated method stub
	Session sess = sf.openSession();
	Transaction tr=sess.beginTransaction();
	Department d=sess.get(Department.class, did);
	boolean status=false;
	if(d!=null) {
		d.setDname(dname);
		d.setDloc(dloc);
		status=true;
		tr.commit();
	}
	sess.close();
	return status;
}

@Override
public Department findByDid(int did) {
	// TODO Auto-generated method stub
	Session sess = sf.openSession();
	Transaction tr=sess.beginTransaction();
	Department d=sess.get(Department.class, did);
	tr.commit();
	sess.close();
	return d;
}

@Override
public List<Department> findAlld() {
	// TODO Auto-generated method stub
	Session sess=sf.openSession();
	Transaction tr=sess.beginTransaction();
	Query q=sess.createQuery("from Department");
	List<Department> dlist=q.getResultList();
	tr.commit();
	sess.close();
	return dlist;
}
}
