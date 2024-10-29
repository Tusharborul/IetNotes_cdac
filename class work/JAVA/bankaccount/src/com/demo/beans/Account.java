package com.demo.beans;

public class Account {
	private int id;
	private int pass;
	private String name;
	private double bal;
	public Account() {
		super();
	}
	public Account(int id, int pass, String name, double bal) {
		super();
		this.id = id;
		this.pass = pass;
		this.name = name;
		this.bal = bal;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getPass() {
		return pass;
	}
	public void setPass(int pass) {
		this.pass = pass;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getBal() {
		return bal;
	}
	public void setBal(double bal) {
		this.bal = bal;
	}
	@Override
	public String toString() {
		return "Account [id=" + id + ", pass=" + pass + ", name=" + name + ", bal=" + bal + "]";
	}
	
	

}
