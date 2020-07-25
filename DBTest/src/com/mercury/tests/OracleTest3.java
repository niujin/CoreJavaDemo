package com.mercury.tests;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Types;

import oracle.jdbc.internal.OracleTypes;

public class OracleTest3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			Connection conn = JDBCUtil.getConnection();
			String sp = "{?=call saveUser(?,?)}";
			CallableStatement cs = conn.prepareCall(sp);
			cs.registerOutParameter(1, Types.INTEGER);
			cs.setString(2, "Jason");
			cs.setInt(3, 78);
			cs.execute();
			sp="{?=call queryUser()}";
			cs = conn.prepareCall(sp);
			cs.registerOutParameter(1, OracleTypes.CURSOR);
			cs.execute();
			ResultSet rs = (ResultSet)cs.getObject(1);
			while(rs.next()){
				System.out.println(rs.getString("Name")+"\t"+rs.getInt("Age"));
			}
			rs.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}
