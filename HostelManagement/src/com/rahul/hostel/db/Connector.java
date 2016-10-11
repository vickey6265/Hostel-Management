package com.rahul.hostel.db;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class Connector {
	
	private static Connection con;
	public static Connection getConnection() throws FileNotFoundException, IOException, ClassNotFoundException, SQLException {
		
		Properties prop=new Properties();
		prop.load(new FileInputStream(new File("application.properties")));
		
		String url=prop.getProperty("url");
		String userName=prop.getProperty("username");
		String password=prop.getProperty("password");
		
		Class.forName("oracle.jdbc.OracleDriver");
		
		if (con==null) {
			con = DriverManager.getConnection(url, userName, password);
			return con;
		}
		else {
			return con;
		}
	}
	
	private Connector() {
		
	}

}
