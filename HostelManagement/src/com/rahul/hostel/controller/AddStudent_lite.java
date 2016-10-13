package com.rahul.hostel.controller;

import java.io.IOException;
import java.sql.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.rahul.hostel.db.StudentData;




@WebServlet("/addstudent_lite")
public class AddStudent_lite extends HttpServlet {
	private static final long serialVersionUID = 1L;

	static int sid=1000;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("start");
		String name=request.getParameter("student_name");
		int age=Integer.parseInt(request.getParameter("student_age"));
		String dob=(request.getParameter("student_dob"));
		
		String address=request.getParameter("student_add");
		String college=request.getParameter("student_college");
		long mobile=Long.parseLong(request.getParameter("student_numb"));
		String email=request.getParameter("student_email");
		String password=request.getParameter("student_pass");
		
		String photo=request.getParameter("student_photo");
		String dateOfJoin=request.getParameter("student_doj");
		sid++;
		System.out.println(name+" "+dob+" "+address+" "+mobile+" "+email+" "+password+" "+photo+" "+dateOfJoin);
		
		
		int i=StudentData.saveStudent_lite(sid, name, age,dob, college, address,  mobile, email, password, dateOfJoin, photo);
	
		if(i>0) {
			System.out.println("done");
		}
		
	}

}
