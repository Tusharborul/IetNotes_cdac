package com.demo.dao;

import java.util.List;

import com.demo.beans.Department;

public interface DeptDao {

	void saveDepartment(Department d);

	boolean removeById(int did);

	boolean modifyById(int did, String dname, String dloc);

	Department findByDid(int did);

	List<Department> findAlld();

}
