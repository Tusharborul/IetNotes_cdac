package com.demo.services;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;

import com.demo.beans.Product;
import com.demo.dao.ProductDaoImpl;
import com.demo.dao.productDao;

public class ProductServiceImpl implements ProductService {
	
	private productDao pdao;

	public ProductServiceImpl() {
		super();
		this.pdao = new ProductDaoImpl();
	}

	@Override
	public boolean addData() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enetr pid");
		int pid=sc.nextInt();
		System.out.println("Enter pname: ");
		String pname=sc.next();
		sc.next();
		System.out.println("Enter quantity: ");
		int qty = sc.nextInt();
		System.out.println("Enter price: ");
		double price = sc.nextDouble();
		System.out.println("Enter expiry date: dd/MM/YYYY");
		String date = sc.next();
		LocalDate ldt = LocalDate.parse(date, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		System.out.println("Enter category id: ");
		int cid = sc.nextInt();
		Product p = new Product(pid, pname, qty, price, ldt, cid);
		return pdao.save(p);
	}

	@Override
	public boolean pdel(int id) {
		
		return pdao.deleteById(id);
	}

	@Override
	public boolean pupdate(int id, int qty, double price) {
		
		return pdao.updateById(id,qty,price);
	}

	@Override
	public List<Product> findAll() {
	     
		return pdao.displayAll();
	}
	

}
