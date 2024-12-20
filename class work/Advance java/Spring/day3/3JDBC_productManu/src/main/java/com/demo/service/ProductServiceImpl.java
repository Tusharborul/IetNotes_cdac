package com.demo.service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.beans.Product;
import com.demo.dao.ProductDao;

@Service
public class ProductServiceImpl implements ProductService{
   @Autowired
	ProductDao pdao;
	Scanner sc=new Scanner(System.in);
	public boolean addNewProduct() {
		System.out.println("enter pid");
		int pid=sc.nextInt();
		System.out.println("enter pname");
		String pname=sc.next();
		System.out.println("enter qty");
		int qty=sc.nextInt();
		System.out.println("enter price");
		double price=sc.nextDouble();
		System.out.println("enter expiry date(dd/MM/yyyy)");
		String dt=sc.next();
		LocalDate ldt=LocalDate.parse(dt,DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		System.out.println("enter cid");
		int cid=sc.nextInt();
		Product p=new Product(pid,pname,qty,price,ldt,cid);
		boolean a=pdao.saveProduct(p);
		return a;
	}

	public boolean delectProduct() {
		System.out.println("enter pid");
		int pid=sc.nextInt();
		boolean a=pdao.deleteProduct(pid);
		return a;
	}

	public boolean modifyProduct() {
		System.out.println("enter pid");
		int pid=sc.nextInt();
		System.out.println("enter pname");
		String pname=sc.next();
		System.out.println("enter qty");
		int qty=sc.nextInt();
		System.out.println("enter price");
		double price=sc.nextDouble();
		System.out.println("enter expiry date(dd/MM/yyyy)");
		String dt=sc.next();
		LocalDate ldt=LocalDate.parse(dt,DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		System.out.println("enter cid");
		int cid=sc.nextInt();
		Product p=new Product(pid,pname,qty,price,ldt,cid);
		boolean a=pdao.updateProduct(p);
		return a;
	}

	@Override
	public Product findById() {
		System.out.println("Enter pid");
		int pid=sc.nextInt();
		return pdao.getElementById(pid);
	}

	@Override
	public List<Product> getall() {
		return pdao.getAllProduct();
	}

	@Override
	public List<Product> getAllByPrice() {
		// TODO Auto-generated method stub\
		System.out.println("Enter Price");
		double price = sc.nextInt();
		return pdao.getByPrice(price);
	}
}
