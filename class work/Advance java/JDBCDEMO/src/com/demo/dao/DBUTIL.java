package com.demo.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBUTIL {
	private static Connection conn=null;
	public static Connection getConnection() {
		
		if(conn==null) {
			try {
				DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
				String url="jdbc:mysql://192.168.10.127:3306/dac93?useSSL=false";
				conn=DriverManager.getConnection(url,"dac93","welcome");
				
			}catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			
		}
		return conn;
		
	}
public static Connection closeMyConnection() {
	if(conn==null) {
		try {
			conn.close();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	return conn;
}

}
