package com.rahul.hostel.db;

import java.io.IOException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
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
	
	public static int saveStudent(int sid,String name, Date dob, int age, String collage, String address, long phoneNo,
			String email, String password, Date dateOfJoin, Date dateOfLeave, String photo,int rid,int roomNo,
	double fees) {
	
		int status=0;
		
		
		String sqlqry="insert into student() values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
		try {
			Connection con=Connector.getConnection();
			
			PreparedStatement ps=con.prepareStatement(sqlqry);
			ps.setInt(1, sid);
			ps.setString(2, name);
			ps.setInt(3, age);
			ps.setDate(4, dob);
			ps.setString(5, collage);
			ps.setString(6, address);
			ps.setLong(7, phoneNo);
			ps.setString(8, email);
			ps.setString(9, password);
			ps.setDate(10, dateOfJoin);
			ps.setDate(11, dateOfLeave);
			ps.setString(12, photo);
			ps.setInt(13, rid);
			ps.setInt(14, roomNo);
			ps.setDouble(15, fees);
			
			status=ps.executeUpdate();
		} catch (ClassNotFoundException | IOException | SQLException e) {
			e.printStackTrace();
		}
		
		
		return status;
	}
	
	public static int saveStudent_lite(int sid,String name, int age, Date dob, String collage, String address, long phoneNo,
			String email, String password, Date dateOfJoin, String photo) {
	
		int status=0;
		
		
		String sqlqry="insert into student_lite() values(?,?,?,?,?,?,?,?,?,?,?)";
		try {
			Connection con=Connector.getConnection();
			
			PreparedStatement ps=con.prepareStatement(sqlqry);
			ps.setInt(1, sid);
			ps.setString(2, name);
			ps.setInt(3, age);
			ps.setDate(4, dob);
			ps.setString(5, collage);
			ps.setString(6, address);
			ps.setLong(7, phoneNo);
			ps.setString(8, email);
			ps.setString(9, password);
			ps.setDate(10, dateOfJoin);
			ps.setString(11, photo);
			
			
			status=ps.executeUpdate();
		} catch (ClassNotFoundException | IOException | SQLException e) {
			e.printStackTrace();
		}
		
		
		return status;
	}
}
