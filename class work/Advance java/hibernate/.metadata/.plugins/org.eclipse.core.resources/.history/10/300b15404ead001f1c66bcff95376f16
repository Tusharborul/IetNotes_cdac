package com.demo.beans;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Facultytab1")
public class Faculty {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int fid;
	private String sname;
	@OneToOne(fetch=FetchType.LAZY,cascade = CascadeType.ALL) //egar fetch
	@JoinColumn(name="courseid")
	private Course c;

	public Faculty() {
		super();
	}
	public Faculty(String sname, Course c) {
		super();
		this.sname = sname;
		this.c = c;
	}
	
	public Faculty(int fid, String sname, Course c) {
		super();
		this.fid = fid;
		this.sname = sname;
		this.c = c;
	}
	public int getFid() {
		return fid;
	}
	public void setFid(int fid) {
		this.fid = fid;
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
		return "Faculty [fid=" + fid + ", sname=" + sname + ", c=" + c + "]";
	}
	
	
	

}
