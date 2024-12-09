package com.demo.service;

import java.util.List;

import com.demo.beans.Product;

public interface ProductService {

	List<Product> getAll();

	Product getById(int pid);

	boolean addNewProduct(Product p);

	boolean deleteById(int pid);

	boolean updateById(Product p);

}
