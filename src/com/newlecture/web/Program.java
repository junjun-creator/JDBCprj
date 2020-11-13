package com.newlecture.web;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Program {
	public static void main(String[] args) {
		String url = "jdbc:oracle:thin:@hi.namoolab.com:1521/xepdb1";
		String id = "NEWLEC";
		String pwd = "11111";
		String sql = "SELECT * FROM MEMBER";
		
		//DriverManager;//Class.forName~~
		try {
			//Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection(url,id,pwd);
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(sql);
			
			String[] nicname = new String[2];
			if(rs.next()) {
				nicname[0] = rs.getString("NICNAME");
			}
			if(rs.next()) {
				nicname[1] = rs.getString("NICNAME");
			}
			
			rs.close();
			st.close();
			con.close();
			
			System.out.printf("nicname : %s\n",nicname[0]);
			System.out.printf("nicname : %s",nicname[1]);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			
			e.printStackTrace();
		}		
	}

}
