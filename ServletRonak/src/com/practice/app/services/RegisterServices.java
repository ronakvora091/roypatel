package com.practice.app.services;

import com.practice.app.dao.RegisterData;
import com.practice.app.dto.UserBean;

public class RegisterServices {

	public UserBean register_logic(UserBean userBeanRegisterLogic) {
		// TODO Auto-generated method stub
		
		
		RegisterData regData=new RegisterData();
	UserBean reg=regData.insertdata(userBeanRegisterLogic);
		
		
		return reg;
	}

	
	
	
}
