package com.rahulvivek.hostel.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.rahulvivek.hostel.db.RectorData;


@WebServlet("/add_rector")
public class AddRector extends HttpServlet {
	private static final long serialVersionUID = 1L;

	static int rid=10;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		System.out.println("let's start");
		String name=request.getParameter("rector_name");
		String dob=(request.getParameter("rector_dob"));
		String address=request.getParameter("rector_add");
		long mobile=Long.parseLong(request.getParameter("rector_numb"));
		String email=request.getParameter("rector_email");
		String password=request.getParameter("rector_pass");
		String photo=request.getParameter("rector_photo");
		String dateOfJoin=request.getParameter("doj");
		
		System.out.println(name+" "+dob+" "+address+" "+mobile+" "+email+" "+password+" "+photo+" "+dateOfJoin);
	
		int i=RectorData.saveRector(rid, name, dob, address,  mobile, email, password, dateOfJoin, photo);
	
		if(i>0) {
			response.sendRedirect("index.html");
		}
	}

}
