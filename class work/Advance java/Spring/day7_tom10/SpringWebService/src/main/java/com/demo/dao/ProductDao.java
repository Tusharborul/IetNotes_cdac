package com.demo.dao;

import java.util.List;

import com.demo.beans.Product;

public interface ProductDao {

	List<Product> getProduct();

	Product getById(int pid);

	boolean save(Product p);

	boolean removeById(int pid);

	boolean modifyById(Product p);

}
