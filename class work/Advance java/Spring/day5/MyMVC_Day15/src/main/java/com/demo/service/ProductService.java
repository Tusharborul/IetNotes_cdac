package com.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.demo.beans.Product;
@Service
public interface ProductService {

	List<Product> getAllpoduct();

	boolean addNewProduct(Product p);

	Product getById(int pid);

	boolean updateProduct(Product p);

	boolean deleteById(int pid);

	

}
