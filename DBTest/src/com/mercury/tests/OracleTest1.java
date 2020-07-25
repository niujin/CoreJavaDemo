package com.mercury.tests;
import java.sql.*;
public class OracleTest1 {
	private static final String DRIVER="oracle.jdbc.driver.OracleDriver";
	private static final String URL="jdbc:oracle:thin:@JIN-PC:1521:XE";
	private static final String USERNAME="jin";
	private static final String PASSWORD="j123456";
	
	public static void main(String args[]){
		try{
			Connection conn = JDBCUtil.getConnection();
			//conn.setAutoCommit(false);
			Statement st = conn.createStatement();
			String sql = "insert into sample values('Lee',57)";
			st.executeUpdate(sql);
			sql = "select * from sample";
			ResultSet rs = st.executeQuery(sql);
			//conn.commit();
			while(rs.next()){
				System.out.println(rs.getString("Name")+"\t"+rs.getInt("Age"));
			}
			rs.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
