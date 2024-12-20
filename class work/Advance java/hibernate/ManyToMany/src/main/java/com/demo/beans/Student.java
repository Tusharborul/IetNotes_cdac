package com.demo.beans;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="StudentTab1")
public class Student {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	private int sid;
	private String sname;
	@ManyToMany
	private Set<Course> clist;
	public Student() {
		super();
	}
	public Student(String sname, Set<Course> clist) {
		super();
		this.sname = sname;
		this.clist = clist;
	}
	public Student(int sid, String sname, Set<Course> clist) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.clist = clist;
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
	public Set<Course> getClist() {
		return clist;
	}
	public void setClist(Set<Course> clist) {
		this.clist = clist;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + "]";
	}
	
	
	
	
	


}
