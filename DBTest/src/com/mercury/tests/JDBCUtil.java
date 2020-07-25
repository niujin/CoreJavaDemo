package com.mercury.tests;

import java.sql.Connection;
import java.sql.DriverManager;

public class JDBCUtil {
	private static final String DRIVER="oracle.jdbc.driver.OracleDriver";
	private static final String URL="jdbc:oracle:thin:@JIN-PC:1521:XE";
	private static final String USERNAME="jin";
	private static final String PASSWORD="j123456";
	public static Connection getConnection(){
		Connection conn = null;
		try{
			Class.forName(DRIVER);
			conn = DriverManager.getConnection(URL,USERNAME,PASSWORD);
		}catch(Exception e){
			e.printStackTrace();
		}
		return conn;
	}
}
