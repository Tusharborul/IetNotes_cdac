package com.demo.test;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;

public class TestPreparedStatement {

	public static void main(String[] args) {
		Connection conn=null;
		try {
			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
			String url="jdbc:mysql://192.168.10.127:3306/dac20?useSSL=false";
			 conn=DriverManager.getConnection(url,"dac20","welcome");
			PreparedStatement pst=conn.prepareStatement("select * from product");
			ResultSet rs=pst.executeQuery();
			while(rs.next()) {
				System.out.println("PRODID : "+rs.getInt(1));
				System.out.println("DESCRIP : "+rs.getString(2));
				System.out.println("PRICE : "+rs.getInt(3));
			
				System.out.println("-------------------------");
			}
			int PRODID=54;
			String DESCRIP="chips 5-pack";
			int PRICE=130;
		
			PreparedStatement pst1=conn.prepareStatement("insert into product values(?,?,?)");
			pst1.setInt(1, PRODID);
			pst1.setString(2, DESCRIP);
			pst1.setInt(3, PRICE);
			int n=pst1.executeUpdate();
			if(n>0) {
				System.out.println("insertion done");
			}
			else {
				System.out.println("error occured");
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		try {
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		

	}

}
