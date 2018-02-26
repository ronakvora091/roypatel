package com.practice.app.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;
import com.practice.app.dto.UserBean;
import com.practice.app.utility.DatabaseConnection;
import com.practice.app.utility.Query;

public class RegisterData {

	
	public UserBean insertdata(UserBean userBeanRegisterLogic) {
		// TODO Auto-generated method stub
		
		
		DatabaseConnection databaseConnection=DatabaseConnection.getDbConnection();
		Connection conInsertData=databaseConnection.getCon();
		
		System.out.println("=== database connection singleton === "+databaseConnection);
		System.out.println("===== connection object === "+conInsertData);
		
		try {
			PreparedStatement prstatement= conInsertData.prepareStatement(Query.registerData);
			prstatement.setString(1, userBeanRegisterLogic.getFirstname());
			prstatement.setString(2, userBeanRegisterLogic.getLastname());

			prstatement.setString(3, userBeanRegisterLogic.getPassword());
			prstatement.setString(4, userBeanRegisterLogic.getEmail());
			prstatement.setString(5, userBeanRegisterLogic.getMobile());
			/*prStatement.setString(6, userBean.getAddress());
			prStatement.setString(7, userBean.getCity());
			prStatement.setString(8, userBean.getPincode());*/
			
			
			int insertrow = prstatement.executeUpdate();
			
			
			System.out.println("====Preparestatement pr=="+prstatement);
			System.out.println("=====i value==="+ insertrow);
			
			if (insertrow==1) {
				System.out.println("Data insert successfully.....");
				
				PreparedStatement selectRegId=conInsertData.prepareStatement(Query.showData);
				selectRegId.setString(1, userBeanRegisterLogic.getEmail());
				
				ResultSet rs=selectRegId.executeQuery();
			//resultset if else part
				
				if (rs.next()) {
					
					System.out.println(rs.getString(1));
					
					//set data to userbean from database ...
					userBeanRegisterLogic.setFirstname(rs.getString(1));
					userBeanRegisterLogic.setLastname(rs.getString(2));
					userBeanRegisterLogic.setPassword(rs.getString(3));
					userBeanRegisterLogic.setEmail(rs.getString(4));
					userBeanRegisterLogic.setMobile(rs.getString(5));
					
					
					
				}
			
			
			
			
			} else {
				
				userBeanRegisterLogic =null;
				System.out.println("====data  not fatched====");
			}
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return userBeanRegisterLogic;
	}

	
	
	
	
}
