package com.practice.app.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.practice.app.dto.UserBean;
import com.practice.app.services.LoginServices;

	
public class LoginController extends HttpServlet {
	
	// defining Global variables
	UserBean userbean;
	
	String login_password;
	String login_mobile;
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
	
		login_password =req.getParameter("log_password");
		login_mobile=req.getParameter("log_mobile");
		
	
		System.out.println(login_mobile);
		System.out.println(login_password);
		
		userbean = new UserBean();
		userbean.setLoginmobile(login_mobile.trim());
		userbean.setLoginpassword(login_password.trim());
		
		
		LoginServices lgservices = new LoginServices();
		userbean=lgservices.loginLogic(userbean);
		
		if (userbean.getMsg()==true) {
			System.out.println("====Login successfully====");
			resp.getWriter().write("<html><body>First name is====="+login_mobile+"<br/>login password is====="+login_password+"</body></html>");
			
		} else {
			System.out.println("====mobile or password is wrong====");
			req.getRequestDispatcher("login.html").include(req, resp);
			
		}
		
		
		
	}
	
	
	

}
