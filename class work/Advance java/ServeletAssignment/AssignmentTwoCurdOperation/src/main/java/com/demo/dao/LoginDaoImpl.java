package com.demo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.demo.beans.User;

public class LoginDaoImpl implements LoginDao{
	
	static Connection conn;
	static PreparedStatement seluser,adduser,sdetails;
	static {
		
		try {
			conn=DBUtil.getMyConnection();
			seluser=conn.prepareStatement("select uname,password,role from user where uname=? and password=?");
			adduser=conn.prepareStatement("insert into user(uname,password,role) values(?,?,?)");
			sdetails=conn.prepareStatement("insert into person(fname,lname,gender,degree,city,skills) values(?,?,?,?,?,?)");	
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Override
	public User validateUser(String uname, String passwd) {
		try {
			seluser.setString(1, uname);
			seluser.setString(2, passwd);
			ResultSet rs=seluser.executeQuery();
			if(rs.next()) {
				return new User(rs.getInt(1),rs.getString(2),rs.getString(3));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
