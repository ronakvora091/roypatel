package com.practice.app.utility;

public interface Query {

	
	public static String registerData= "insert into insertData(reg_firstname,reg_lastname,reg_password,reg_email,reg_mobile) values(?,?,?,?,?)";
	
	public static String showData="select * from insertData where reg_email = ?";
}
