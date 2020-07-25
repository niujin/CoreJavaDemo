package com.mercury.tests;
import java.sql.*;
import java.util.*;
public class OracleTest2 {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Input Name:");
		String name = sc.nextLine();
		try{
			Connection conn = JDBCUtil.getConnection();
			String sql = "select * from sample where name =?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, name);
			//dangerous, cannot avoid sql injection attack
			ResultSet rs = ps.executeQuery();
			while(rs.next()){
				System.out.println(rs.getString("Name")+"\t"+rs.getInt("Age"));
			}
			rs.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
