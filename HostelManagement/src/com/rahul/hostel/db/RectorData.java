package com.rahul.hostel.db;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Date;
import java.util.LinkedList;
import java.util.List;

public class RectorData {

	public static List<Rector> getAllRector() {
		List<Rector> rectorList = new LinkedList<Rector>();

		Connection con = null;
		try {
			con = Connector.getConnection();

			Statement smt = con.createStatement();
			ResultSet rs = smt.executeQuery("select * from rector");

			while (rs.next()) {
				Rector emp = new Rector(rs.getInt("rid"), rs.getString("name"), rs.getString("dob"),
						rs.getString("collage"), rs.getString("address"), rs.getLong("phoneno"), rs.getString("email"),
						rs.getString("password"), rs.getString("daj"), rs.getString("dol"), rs.getString("photo"));

				rectorList.add(emp);
			}
			return rectorList;
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
	
	public static int saveRector(int rid, String name, Date dob, String collage, String address, long phoneNo, String email,
			String password, Date dateOfJoin, Date dateOfLeave,String photo) {
		int status=0;
		
		String sqlqry="insert into rector() values(?,?,?,?,?,?,?,?,?,?,?)";
		try {
			Connection con=Connector.getConnection();
			
			PreparedStatement ps=con.prepareStatement(sqlqry);
			ps.setInt(1, rid);
			ps.setString(2, name);
			ps.setDate(4, dob);
			ps.setString(5, collage);
			ps.setString(6, address);
			ps.setLong(7, phoneNo);
			ps.setString(8, email);
			ps.setString(9, password);
			ps.setDate(10, dateOfJoin);
			ps.setDate(10, dateOfLeave);
			ps.setString(11, photo);
			
			
			status=ps.executeUpdate();
		} catch (ClassNotFoundException | IOException | SQLException e) {
			e.printStackTrace();
		}
		
		
		return status;
	}

}
