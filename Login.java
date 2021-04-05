package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;

public class Login extends HttpServlet {
	
	String username,password;
	
	public void doPost(HttpServletRequest req, jakarta.servlet.http.HttpServletResponse res) throws IOException {
		
		res.setContentType("text/html");
		
		PrintWriter out = res.getWriter();
		
		username = req.getParameter("name");
		password = req.getParameter("password");
		
		
		
		try {
		
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost/user","root","");
			
			Statement stmt = con.createStatement();
			
			String sql = "select * from users where username ='"+username+"' and password = '" +password+"'" ;
			
			ResultSet rs = stmt.executeQuery(sql);
			
			if(rs.next()) {
				
				res.sendRedirect("index.jsp");
				out.println("Login Successfully!!");
			}
			else {
				out.println("Login Failed !! Invalid Username or Password !!");
			}
		
	}catch(Exception e) {
		out.println(""+e);
	}

}
}
