package com.practice.app.utility;

public interface InitConnection {

	//Because this is interface we don't have to create object of it...
	
	// These strings can use any data connection for mysql Globally
	
			public static final String DRIVER="com.mysql.jdbc.Driver";		//Build jar file of mysql connector
			
			public static final String URL="jdbc:mysql://localhost:3306/ronak";		
			
			public static final String USER="root";			
			
			public static final String PASSWORD="root";
			
}
