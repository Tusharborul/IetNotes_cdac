package com.demo.dao;

import java.util.List;

import com.demo.beans.Product;

public interface ProductDao {

	boolean saveProduct(Product p);

	boolean deleteProduct(int pid);

	boolean updateProduct(Product p);

	Product getElementById(int pid);

	List<Product> getAllProduct();

	List<Product> getByPrice(double price);

}
