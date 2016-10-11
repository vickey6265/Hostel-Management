package com.rahul.hostel.db;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
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

}
