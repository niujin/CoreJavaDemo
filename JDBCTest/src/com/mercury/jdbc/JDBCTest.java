package com.mercury.jdbc;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Properties;

public class JDBCTest {
	private String DRIVER;
	private String URL;
	private String NAME;
	private String PASSWORD;
	public void parse(){
		Properties pro = new Properties();
		FileInputStream fis;
		try {
			fis = new FileInputStream("D:\\test.properties");
			pro.load(fis);
			DRIVER=pro.getProperty("DRIVER");
			URL=pro.getProperty("URL");
			NAME=pro.getProperty("USERNAME");
			PASSWORD=pro.getProperty("PASSWORD");
			Class.forName(DRIVER);
			Connection conn= DriverManager.getConnection(URL,NAME, PASSWORD);
			String sql ="Select * from sample where name = ?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, "aaa");
			ps.execute();
			ResultSet rs= ps.getResultSet();
			while(rs.next()){
				System.out.println(rs.getString("name")+"\t"+rs.getInt("age"));
			}
			rs.close();
			ps.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
}
