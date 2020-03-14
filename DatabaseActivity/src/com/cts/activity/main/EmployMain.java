package com.cts.activity.main;

import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.Statement;

//import com.mysql.jdbc.PreparedStatement;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

import java.sql.PreparedStatement;;
//import com.mysql.jdbc.Statement;

public class EmployMain {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) throws ClassNotFoundException, SQLException
	{
		Class.forName("com.mysql.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/cts";
		String username="root",name;
		String password="password";
//		int id;
//		int phone;
//		System.out.println("Enter id:");
//		id=Integer.parseInt(sc.nextLine());
//		System.out.println("Enter name:");
//		name=sc.nextLine();
//		System.out.println("Enter address:");
//		address=sc.nextLine();
//		System.out.println("Enter phone:");
//		phone=sc.nextInt();
		Connection conn = DriverManager.getConnection(url,username,password);
		
		
		    Statement stmt = conn.createStatement();
//		    String query="create table people2(id int not null,name text,place text,age int);";
////		String query="update employ set address='Maharastra' where id=103";
////		String query="delete from employ where id=101";
//		int result=stmt.executeUpdate(query);
//		if(result>0) {
//			System.out.println("Operation performed successfully");
//		}
//		else {
//			System.out.println("Try again");
//		}
		String query1="load data local infile 'C:\\\\ProgramData\\\\MySQL\\\\MySQL Server 5.7\\\\Uploads\\\\data.csv' into table people2 FIELDS TERMINATED BY ',' ENCLOSED BY '"+'"'+"' LINES TERMINATED BY '\n';";
		int result1=stmt.executeUpdate(query1);
		if(result1>0) {
			System.out.println("Operation performed successfully");
		}
		else {
			System.out.println("Try again");
		}
//		while(rs.next()) {
//			System.out.println(rs.getInt(1)+":"+rs.getString(2)+":"+rs.getString(3)+":"+rs.getString(4));
//		}
//		String query="insert into employ values(?,?,?,?)";
//	PreparedStatement ps =  conn.prepareStatement(query);
//		ps.setInt(1, id);
//		ps.setString(2, name);
//		ps.setString(3, address);
//		ps.setInt(4, phone);
//		
//		int result=ps.executeUpdate();
	}

}