package com.demo.tags;

import java.io.IOException;

import jakarta.servlet.jsp.JspWriter;
import jakarta.servlet.jsp.tagext.TagSupport;



public class HelloTagHandler extends TagSupport{
	private String fname,lname;

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}
	
	public int doStartTag() {
		return EVAL_BODY_INCLUDE;
		
	}
	
	public int doEndTag() {
		JspWriter out=pageContext.getOut();
		try {
		out.println("Welcome to hello tag library  <br>");
		out.println("we are displaying fname and lname  <br>");
		out.println("Hello : "+fname+"  "+lname);
		}catch(IOException e) {
			e.printStackTrace();
		}
		return EVAL_PAGE;
	}
	

}
