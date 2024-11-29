package com.demo.service;

import java.util.List;

import com.demo.beans.Department;

public interface DeptService {

	void addnewDepartment();

	boolean removeByid(int did);

	boolean modifyById(int did, String dname, String dloc);

	Department findById(int did);

	List<Department> findAll();



}
