package com.cts.activity.bean;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseDemo {
	public static void main(String args[]) throws SQLException, ClassNotFoundException {
		Class.forName("com.mysql.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/cts";
		String username="root",name;
		String password="password";
		Connection conn = DriverManager.getConnection(url,username,password);
		Statement stmt=conn.createStatement();
		String query="Select * from employ";
		ResultSet rs=stmt.executeQuery(query);
		while(rs.next()) {
			System.out.println(rs.getInt(1)+":"+rs.getString(2)+":"+rs.getString(3)+":"+rs.getString(4));
		}
//		String query1="insert into employ(id,name,address,phone) values(110,'Stan','Haryana',78976432)";
//		int result=stmt.executeUpdate(query1);
//		if(result>0) {
//			System.out.println("Inserted");
//		}
//		else {
//			System.out.println("not inserted");
//		}
		String query2="update employ set phone='676' where id=102";
		int result2=stmt.executeUpdate(query2);
		if(result2>0) {
			System.out.println("Upated");
		}
		else {
			System.out.println("not updated");
		}
	}

}
