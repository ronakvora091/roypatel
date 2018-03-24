package com.practice.app.controller;

import java.io.IOException;
import java.lang.ProcessBuilder.Redirect;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.practice.app.dto.UserBean;
import com.practice.app.services.RegisterServices;

public class RegisterController extends HttpServlet {
	
	UserBean userbean;
	String register_firstname,register_lastname,register_email,register_password,register_mobile,
	register_pincode,register_address,register_city;
	
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		
		register_firstname=req.getParameter("reg_firstname");
		register_lastname=req.getParameter("reg_lastname");
		register_email=req.getParameter("reg_email");
		register_password=req.getParameter("reg_password");
		register_mobile=req.getParameter("reg_mobile");
		
		
		//Servlet context  
		//ServletContext context=getServletContext();
		//String drname=context.getInitParameter("dname");
		
	//	resp.getWriter().println(drname);
		
		System.out.println(register_firstname);
	
		resp.getWriter().write("<html><body>First name is :- "+register_firstname+"</body></html><br/>");
	
		userbean=new UserBean();
		userbean.setFirstname(register_firstname.trim());
		userbean.setLastname(register_lastname.trim());
		userbean.setPassword(register_password.trim());
		userbean.setEmail(register_email.trim());
		userbean.setMobile(register_mobile.trim());
		
				
		RegisterServices reglogic=new RegisterServices();
		userbean = reglogic.register_logic(userbean);
		
		if (userbean!= null ) {
			
			resp.getWriter().write("<html><body>Data Inserted</body></html>");
			resp.getWriter().write("<html><body>You can login now...</body></html>");
			req.getRequestDispatcher("login.html").include(req, resp);
		
		} else {
			System.out.println("data not  inserted");

		}
		
		
		
	}
	
	
	

}
