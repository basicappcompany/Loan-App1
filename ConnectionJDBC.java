package com.hackathon.loanapp.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionJDBC {
	Connection conn;
	
	public static String driver = "com.mysql.jdbc.Driver";
	public static String CONNECTION_STRING_JDBC = "jdbc:mysql://10.117.189.42:3306/loan";
	public static String username = "root";
	public static String password = "root";
	
	public Connection getConnection(){
		try {
			Class.forName(driver);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		try {
			conn = DriverManager.getConnection(CONNECTION_STRING_JDBC, username, password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return conn;
	}
	
}
