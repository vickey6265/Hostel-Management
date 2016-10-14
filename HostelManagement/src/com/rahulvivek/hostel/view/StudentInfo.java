package com.rahulvivek.hostel.view;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.rahulvivek.hostel.db.Student;


@WebServlet("/info_student")
public class StudentInfo extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Student si = new Student(Integer.parseInt(request.getParameter("sid")));
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		
/*--------------------------- Header Here ---------------------------*/
		
		request.getRequestDispatcher("hostel_header.html").include(request, response);
		
/*--------------------------- Student Details Division ---------------------------*/
		
		pw.print("<div id=\"student_info_student\">");
		pw.print("<label>"+si.getPhoto()+"</label><br/>");
		pw.print("<label>"+si.getName()+"</label><br/>");
		pw.print("<label>"+si.getAge()+"</label><br/>");
		pw.print("<label>"+si.getEmail()+"</label><br/>");
		pw.print("<label>"+si.getAddress()+"</label><br/>");
		pw.print("<label>"+si.getDob()+"</label><br/>");
		pw.print("<label>"+si.getPhoneNo()+"</label><br/>");
		pw.print("<label>"+si.getDateOfJoin()+"</label><br/>");
		pw.print("<label>"+si.getFees()+"</label><br/>");
		pw.print("<label>"+si.getRoomNo()+"</label><br/>");
		pw.print("<label>"+si.getFees()+"</label><br/>");
		pw.print("<label>"+si.getDateOfLeave()+"</label><br/>");
		
		pw.print("</div>");
		
/*----------------------Footer Here--------------------*/
		request.getRequestDispatcher("hostel_footer.html").include(request, response);
	}
}
