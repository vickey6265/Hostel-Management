package com.rahul.hostel.view;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.rahul.hostel.db.Connector;
import com.rahul.hostel.db.Student;
import com.rahul.hostel.db.StudentData;

public class Test {

	public static void main(String[] args) {

		Student stu = StudentData.getStudent_lite(1001);

		System.out.println(stu);

		Connection con = null;
		try {
			con = Connector.getConnection();

			Statement smt = con.createStatement();
			ResultSet rs = smt.executeQuery("select MAX(sid) sid from student_lite");
			
			int sid=rs.getInt("sid");
			System.out.println(sid);

		} catch (ClassNotFoundException | IOException | SQLException e) {
			e.printStackTrace();
		} /*finally {
			if (con != null) {
				try {
					//con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}*/
	}

}
