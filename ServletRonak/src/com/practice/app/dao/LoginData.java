package com.practice.app.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.practice.app.dto.UserBean;
import com.practice.app.utility.DatabaseConnection;
import com.practice.app.utility.Query;


public class LoginData {

	public UserBean showData(UserBean userBeanShowData) {
	
		DatabaseConnection dbConnectionShowdata = DatabaseConnection.getDbConnection();
		Connection showData = dbConnectionShowdata.getCon();
		
		
		System.out.println("===Login database connection ==="+dbConnectionShowdata);
	System.out.println("====login data connection object==="+showData);	
	
	try {
		java.sql.PreparedStatement prShowdata =showData.prepareStatement(Query.loginShowdata);
		
		prShowdata.setString(1, userBeanShowData.getLoginmobile());
		prShowdata.setString(2, userBeanShowData.getLoginpassword());
		
		ResultSet rsShowData =prShowdata.executeQuery();
		
		
		while (rsShowData.next())
		{
		
		if(userBeanShowData.getLoginmobile().contentEquals(rsShowData.getString(5)) && userBeanShowData.getLoginpassword().contentEquals(rsShowData.getString(3)))
		
			{
			
			userBeanShowData.setMsg(true);
			}
		else 
			{
			userBeanShowData.setMsg(false);
					
			}
		
		
		}
		//To be continue..
		
	} catch (SQLException e) {
		
		System.out.println("SQLException==="+e);
		
		}
	
	
	
		
		return userBeanShowData;
	}

}
