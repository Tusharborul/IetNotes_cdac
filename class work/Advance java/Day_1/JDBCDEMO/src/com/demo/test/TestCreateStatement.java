package com.demo.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;

public class TestCreateStatement {

	public static void main(String[] args) {
		try {
			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
			String url="jdbc:mysql://192.168.10.127:3306/dac20?useSSL=false";
			Connection conn=DriverManager.getConnection(url,"dac20","welcome");
			Statement st=conn.createStatement();
			ResultSet rs=st.executeQuery("select * from product");
			while(rs.next()) {
				System.out.println("PRODID : "+rs.getInt(1));
				System.out.println("DESCRIP : "+rs.getString(2));
				System.out.println("PRICE : "+rs.getInt(3));
			
				System.out.println("-------------------------");
			}
			int PRODID=14;
			String DESCRIP="biscuits 3-pack";
			int PRICE=30;
		
			String query="insert into product values("+PRODID+",'"+DESCRIP+"',"+PRICE+")";
			System.out.println(query);
			int n=st.executeUpdate(query);
			if(n>0)
			   System.out.println("insertion done!!");
			else
				System.out.println("error occured");
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
