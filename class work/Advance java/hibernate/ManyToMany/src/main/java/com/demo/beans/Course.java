package com.demo.beans;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Coursetab1")
public class Course {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private int cid;
	private String cname;
	@ManyToMany(mappedBy = "clist")
	private Set<Student> slist;

	public Course() {
		super();
	}

	public Course(String cname, Set<Student> slist) {
		super();
		this.cname = cname;
		this.slist = slist;
	}

	public Course(int cid, String cname, Set<Student> slist) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.slist = slist;
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public Set<Student> getSlist() {
		return slist;
	}

	public void setSlist(Set<Student> slist) {
		this.slist = slist;
	}

	@Override
	public String toString() {
		return "Course [cid=" + cid + ", cname=" + cname + ", slist=" + slist + "]";
	}

	
	

	
}
