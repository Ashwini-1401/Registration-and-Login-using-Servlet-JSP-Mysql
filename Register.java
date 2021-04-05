package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;

public class Register extends HttpServlet {
	String username,useremail,password;
	
	
	public void doPost(HttpServletRequest req, jakarta.servlet.http.HttpServletResponse res) throws IOException{
		res.setContentType("text/html");
			PrintWriter out =res.getWriter();
			
			username = req.getParameter("name");
			useremail = req.getParameter("email");
			password = req.getParameter("password");
			
          //			out.println(username + useremail + password);
			
			// Connection to database
			try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost/user","root","");
			String sql = "insert into users (username,useremail,password) values(?,?,?)";
			PreparedStatement ps = con.prepareStatement(sql);
			
			ps.setString(1, username);
			ps.setString(2, useremail);
			ps.setString(3, password);
			
			ps.executeUpdate();
			
			// out.println("Your data is inserted Successfully!!!");
			res.sendRedirect("login.jsp");
			//out.println("<script type=\"text/javascript\">");
			out.println("alert('Data entered Successfully!!');");
			//out.println("</script>");
			
			
	}catch(Exception e)
			{
		out.println(""+e);
			}
}
}
