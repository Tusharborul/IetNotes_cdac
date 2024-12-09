package com.demo.beans;

public class Order {
	private int Oid;
	private Product p;
	public Order() {
		super();
		System.out.println("in default const of order");
	}
	public Order(int oid, Product p) {
		super();
		System.out.println("in para const of order");
		Oid = oid;
		this.p = p;
	}
	public int getOid() {
		return Oid;
	}
	public void setOid(int oid) {
		System.out.println("in setter method of Oid in order");
		Oid = oid;
	}
	public Product getP() {
		return p;
	}
	public void setP(Product p) {
		System.out.println("in setter method of P in order");
		this.p = p;
		
	}
	@Override
	public String toString() {
		return "Order [Oid=" + Oid + ", p=" + p + "]";
	}
	
	
	

}
