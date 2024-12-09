package com.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.beans.Product;
import com.demo.dao.ProductDao;

@Service
public class ProductServiceImpl implements ProductService {
	
	@Autowired
	ProductDao pdao;

	public List<Product> getAll() {
		// TODO Auto-generated method stub
		return pdao.getProduct();
	}

	@Override
	public Product getById(int pid) {
		// TODO Auto-generated method stub
		return pdao.getById(pid);
	}

	@Override
	public boolean addNewProduct(Product p) {
		// TODO Auto-generated method stub
		return pdao.save(p);
	}

	@Override
	public boolean deleteById(int pid) {
		// TODO Auto-generated method stub
		return pdao.removeById(pid);
	}

	@Override
	public boolean updateById(Product p) {
		// TODO Auto-generated method stub
		return pdao.modifyById(p);
	}
	

}
