package com.rahulvivek.hostel.view;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.rahulvivek.hostel.db.Rector;
import com.rahulvivek.hostel.db.RectorData;
import com.rahulvivek.hostel.db.Student;

@WebServlet("/rector_info")
public class RectorInfo extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Rector ri = RectorData.getRector(Integer.parseInt(request.getParameter("rid")));
		
		System.out.println(ri.toString());
		//Student si = new Student(Integer.parseInt(request.getParameter("sid")));
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		
/*--------------------------- Header Here ---------------------------*/
		
		request.getRequestDispatcher("hostel_header.html").include(request, response);
		
/*----------------- Rector Details Division -----------------*/
		
		pw.print("<div id=\"rector_info\">");
		pw.print("<label>"+ri.getName()+"</label><br/>");
		pw.print("<label>"+ri.getAddress()+"</label><br/>");
		pw.print("<label>"+ri.getEmail()+"</label><br/>");
		pw.print("<label>"+ri.getDob()+"</label><br/>");
		pw.print("<label>"+ri.getPhoneno()+"</label><br/>");
		pw.print("<img src=\""+ri.getPhoto()+"\"/><br/>");
		
		
		pw.print("</div>");
		
/*------------------- Student Details Division ----------------------*/
		/*pw.print("<div id=\"student_info\">");
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
		*/
/*----------------------Footer Here--------------------*/
		request.getRequestDispatcher("hostel_footer.html").include(request, response);
	}

}
