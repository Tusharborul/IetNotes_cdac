package com.demo.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="StudentTab1")
public class Student {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	private int sid;
	private String sname;
	@ManyToOne
	@JoinColumn
	private Course c;
	public Student() {
		super();
	}
	public Student(String sname, Course c) {
		super();
		this.sname = sname;
		this.c = c;
	}
	public Student(int sid, String sname, Course c) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.c = c;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public Course getC() {
		return c;
	}
	public void setC(Course c) {
		this.c = c;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname +"]";
	}
	
	
	
	


}
