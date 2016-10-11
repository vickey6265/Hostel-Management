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
		
		
		String sqlqry="insert into student() values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
		try {
			Connection con=Connector.getConnection();
			
			PreparedStatement ps=con.prepareStatement(sqlqry);
			ps.setInt(1, sid);
			ps.setString(2, name);
			ps.setDate(3, dob);
			ps.setString(4, collage);
			ps.setString(5, address);
			ps.setLong(6, phoneNo);
			ps.setString(7, email);
			ps.setString(8, password);
			ps.setDate(9, dateOfJoin);
			ps.setDate(10, dateOfLeave);
			ps.setString(11, photo);
			ps.setInt(12, rid);
			ps.setInt(13, roomNo);
			ps.setDouble(14, fees);
			
			status=ps.executeUpdate();
		} catch (ClassNotFoundException | IOException | SQLException e) {
			e.printStackTrace();
		}
		
		
		return status;
	}
	
	public static int saveStudent_lite(int sid,String name, Date dob, int age, String collage, String address, long phoneNo,
			String email, String password, Date dateOfJoin, Date dateOfLeave, String photo,int rid,int roomNo,
	double fees) {
	
		int status=0;
		
		
		String sqlqry="insert into student_lite() values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
		try {
			Connection con=Connector.getConnection();
			
			PreparedStatement ps=con.prepareStatement(sqlqry);
			ps.setInt(1, sid);
			ps.setString(2, name);
			ps.setDate(3, dob);
			ps.setString(4, collage);
			ps.setString(5, address);
			ps.setLong(6, phoneNo);
			ps.setString(7, email);
			ps.setString(8, password);
			ps.setDate(9, dateOfJoin);
			ps.setDate(10, dateOfLeave);
			ps.setString(11, photo);
			ps.setInt(12, rid);
			ps.setInt(13, roomNo);
			ps.setDouble(14, fees);
			
			status=ps.executeUpdate();
		} catch (ClassNotFoundException | IOException | SQLException e) {
			e.printStackTrace();
		}
		
		
		return status;
	}
}
