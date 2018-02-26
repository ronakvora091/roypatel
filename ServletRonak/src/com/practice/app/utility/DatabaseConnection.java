package com.practice.app.utility;

import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;

public class DatabaseConnection implements InitConnection {

	private static final DatabaseConnection db_connection = new DatabaseConnection();
	
	private Connection con;
	
	private DatabaseConnection() 		//Private constructor ...
	{
		
		try {
			
			Class.forName(DRIVER);		//Loads jdbc Driver from .jar file
			
			con=(Connection) DriverManager.getConnection(URL, USER, PASSWORD);
			
			
		} 
		
		catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("ClassNotFoundException   "+e);
			e.printStackTrace();
		} 
		
		catch (SQLException e) {
			// TODO Auto-generated catch block
		System.out.println("SQLException   "+e);
			e.printStackTrace();
		}		
		
		
	}

	public Connection getCon() {
		return con;
	}

	public void setCon(Connection con) {
		this.con = con;
	}

	public static DatabaseConnection getDbConnection() {
		return db_connection;
	}
	
	
}
