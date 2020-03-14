package com.cts.activity.main;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CsvWrite {

	public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException {

		Class.forName("com.mysql.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/cts";
		String username="root";
		String password="password";
		Connection conn = DriverManager.getConnection(url,username,password);
		String sql = "INSERT INTO people3 (id, name, place, age) VALUES (?, ?, ?, ?, ?)";
		PreparedStatement ps =  conn.prepareStatement(sql);
		 BufferedReader lineReader = new BufferedReader(new FileReader("C:\\Users\\Lenovo\\Desktop\\data.csv"));
         String lineText = null;
         lineReader.readLine();
         int i=0;
         while((lineText=lineReader.readLine())!=null) {
        	 String[] data = lineText.split(",");
        	 int id=Integer.parseInt(data[i++]);
        	 String name=data[i++];
        	 String place=data[i++];
        	 int age=Integer.parseInt(data[i++]);
        	 ps.setInt(, x);
         }
         lineReader.close();
	}

}
