package com.rahul.hostel.main;

import java.io.IOException;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.rahul.hostel.db.RectorData;


@WebServlet("/add_rector")
public class AddRector extends HttpServlet {
	private static final long serialVersionUID = 1L;

	static int rid=1000;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		System.out.println("start");
		String name=request.getParameter("rector_name");
		String dob=(request.getParameter("rector_dob"));
		SimpleDateFormat format=new SimpleDateFormat("dd/mm/yyyy");
		java.sql.Date utilDate = null;
		try {
			utilDate = (Date) format.parse(dob);
			System.out.println(utilDate);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String address=request.getParameter("rector_add");
		long mobile=Long.parseLong(request.getParameter("rector_numb"));
		String email=request.getParameter("rector_email");
		String password=request.getParameter("rector_pass");
		
		String photo=request.getParameter("rector_photo");
		Date dateOfJoin=(Date) Calendar.getInstance().getTime();
		rid++;
	
		int i=RectorData.saveRector(rid, name, (Date) utilDate, address,  mobile, email, password, dateOfJoin, photo);
	
		if(i>0) {
			System.out.println("done");
		}
	}

}
