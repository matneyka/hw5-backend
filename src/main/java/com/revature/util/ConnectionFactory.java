package com.revature.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	private static ConnectionFactory cf = null;
	private static boolean build = true;
	
	private ConnectionFactory () {
		build = false;
	}
	
	public static synchronized ConnectionFactory getInstance () {
		return (build) ? cf = new ConnectionFactory() : cf;
	}
	
	public Connection getConnection() {
		Connection conn = null;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			conn = DriverManager.getConnection(
					"jdbc:oracle:thin:@simplebank.cfm2qtumhhir.us-east-2.rds.amazonaws.com:1521:ORCL", 
					"matneyka", 
					"anotherp4ssw0rd");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException sqle) {
			sqle.printStackTrace();
		}
		
		return conn;
		
	}
}