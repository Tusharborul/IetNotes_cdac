package com.demo.service;

import java.util.List;
import java.util.Scanner;

import com.demo.beans.Department;
import com.demo.dao.DeptDao;
import com.demo.dao.DeptDaoImpl;

public class DeptServiceImpl implements DeptService{
   DeptDao ddao;

public DeptServiceImpl() {
	super();
	this.ddao = new DeptDaoImpl();
}

@Override
public void addnewDepartment() {
	Scanner sc=new Scanner(System.in);
	System.out.println("enetr deptid");
	int deptid=sc.nextInt();
	System.out.println("enetr dname");
	String dnm=sc.next();
	System.out.println("enetr location");
	String dloc=sc.next();
	Department d=new Department(deptid,dnm,dloc,null);
	ddao.saveDepartment(d);
}

@Override
public boolean removeByid(int did) {
	return ddao.removeById(did);
}

@Override
public boolean modifyById(int did, String dname, String dloc) {
	// TODO Auto-generated method stub
	return ddao.modifyById(did, dname, dloc);
}

@Override
public Department findById(int did) {
	// TODO Auto-generated method stub
	return ddao.findByDid(did);
}

@Override
public List<Department> findAll() {
	// TODO Auto-generated method stub
	return ddao.findAlld();
}


   
}
