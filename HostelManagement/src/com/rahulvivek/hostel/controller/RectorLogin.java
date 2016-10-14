package com.rahulvivek.hostel.controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.rahulvivek.hostel.db.Connector;

@WebServlet("/rector_login")
public class RectorLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String email = request.getParameter("rector_un");
		String password = request.getParameter("rector_pw");

		int rid=0;
		Connection con;
		try {
			con = Connector.getConnection();
			Statement stm = con.createStatement();
			ResultSet rs = stm.executeQuery("select rid from rector where email='"+email+"' and password='"+password+"'");
			while (rs.next()) {
				rid = rs.getInt("rid");
			}
		} catch (ClassNotFoundException | IOException | SQLException e) {
			e.printStackTrace();
		}
		
		if(rid>0) {
			response.sendRedirect("rector_info?rid="+rid);
		}
		else {
			response.sendRedirect("index.html");
		}

	}

}
