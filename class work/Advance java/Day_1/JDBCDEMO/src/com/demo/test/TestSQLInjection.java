package com.demo.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;

public class TestSQLInjection {

	public static void main(String[] args) {
		try {
			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
			String url="jdbc:mysql://192.168.10.127:3306/dac20?useSSL=false";
			Connection conn=DriverManager.getConnection(url,"dac20","welcome");
			Statement st=conn.createStatement();
			String user="Alice";
			String password="password123' or '1'='1";
			String query="select * from users where name='"+user+"' and password='"+password+"'";
			System.out.println(query);
			ResultSet rs=st.executeQuery(query);
			while(rs.next()) {
				System.out.println("User : "+rs.getString(2));
				System.out.println("Password : "+rs.getString(3));
				System.out.println("role : "+rs.getString(4));
				System.out.println("-----------");
			}
					
		} catch (SQLException e) 
		{
			e.printStackTrace();
		}

	}  

}
