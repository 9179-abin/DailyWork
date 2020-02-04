package com.cts.training.controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/loginuser")
public class LoginCheck extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse responce) throws ServletException, IOException {
		Connection conn;
		int ch=0;
	    String url="jdbc:mysql://localhost:3306/cts";
		String username="root";
		String password="password";
		String query="select * from register";
		String name =request.getParameter("name");
		String pass1=request.getParameter("password1");
		PreparedStatement ps=null;
		RequestDispatcher rd = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(url,username,password);
			Statement stmt = conn.createStatement();
			ResultSet rs=stmt.executeQuery(query);
		    while(rs.next()) {
		    	if((rs.getString("name").equals(name)) && (rs.getString("password1").equals(pass1))) {
		    		ch=1;
		    		break;
		    	}
		    	
		    }
		    if(ch==1) {
		    	rd=request.getRequestDispatcher("home.html");
		    	rd.forward(request, responce);
		    }
		    else {
		    	System.out.println("Not a valid user");
		    	rd=request.getRequestDispatcher("login.html");
		    	rd.include(request, responce);
		    }
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
