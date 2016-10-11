package com.rahul.hostel.db;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;

public class StudentData {

	public static List<Student> getAllRector() {
		List<Student> studentList = new LinkedList<Student>();

		Connection con = null;
		try {
			con = Connector.getConnection();

			Statement smt = con.createStatement();
			ResultSet rs = smt.executeQuery("select * from student");

			while (rs.next()) {
				Student emp = new Student(rs.getInt("sid"), rs.getString("name"), rs.getString("dob"), rs.getInt("age"),
						rs.getString("collage"), rs.getString("address"), rs.getLong("phoneno"), rs.getString("email"),
						rs.getString("password"), rs.getString("doj"), rs.getString("dol"), rs.getInt("rid"),
						rs.getInt("roomno"), rs.getDouble("fees"), rs.getString("photo"), rs.getBoolean("access"));

				studentList.add(emp);
			}
			return studentList;
		} catch (ClassNotFoundException | IOException | SQLException e) {
			e.printStackTrace();
		} finally {
			if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return null;
	}
}
