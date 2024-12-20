package com.demo.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Prod11")
public class Product {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int Pid;
	private String Pname;
	private int quantity;
	private float price;
	public Product() {
		super();
	}
	public Product(String pname, int quantity, float price) {
		super();
		Pname = pname;
		this.quantity = quantity;
		this.price = price;
	}
	public Product(int pid, String pname, int quantity, float price) {
		super();
		Pid = pid;
		Pname = pname;
		this.quantity = quantity;
		this.price = price;
	}
	public int getPid() {
		return Pid;
	}
	public void setPid(int pid) {
		Pid = pid;
	}
	public String getPname() {
		return Pname;
	}
	public void setPname(String pname) {
		Pname = pname;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [Pid=" + Pid + ", Pname=" + Pname + ", quantity=" + quantity + ", price=" + price + "]";
	}
	
	
	

}
