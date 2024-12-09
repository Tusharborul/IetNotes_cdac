package com.demo.service;

import java.util.List;

import com.demo.beans.Product;

public interface ProductService {

	boolean addNewProduct();

	boolean delectProduct();

	boolean modifyProduct();

	Product findById();

	List<Product> getall();

	List<Product> getAllByPrice();

}
