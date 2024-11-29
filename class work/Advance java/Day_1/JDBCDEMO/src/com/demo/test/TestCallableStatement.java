package com.demo.test;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestCallableStatement {

	public static void main(String[] args) {
	    try {
	        DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
	        
	        String url = "jdbc:mysql://192.168.10.127:3306/dac20?useSSL=false";
	        Connection conn = DriverManager.getConnection(url, "dac20", "welcome");
	      
	        CallableStatement cst = conn.prepareCall("call getRoleCount(?, ?)");
	        cst.setString(1, "admin");
	        cst.registerOutParameter(2, java.sql.Types.INTEGER);
	        cst.execute();
	   
	        int roleCount = cst.getInt(2);
	        System.out.println("Role Count : " + roleCount);
	    
	        cst.close();
	        conn.close();
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	}

}
