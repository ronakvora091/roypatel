package com.practice.app.services;

import com.practice.app.dao.LoginData;
import com.practice.app.dto.UserBean;

public class LoginServices {

	public UserBean loginLogic(UserBean userbeanloginlogic) {
		
		
	LoginData lgdata =new LoginData();
	userbeanloginlogic = lgdata.showData(userbeanloginlogic);
		
		
		
		
		return userbeanloginlogic;
	
	}

	
}
