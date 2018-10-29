package com.cg.utility;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.SimpleDriverDataSource;

public class MainApp {
	static JdbcTemplate jdbcTemplateObj;
	static SimpleDriverDataSource dataSourceObj;

	// Database Configuration Parameters
	static String DB_USERNAME = "root";
	static String DB_PASSWORD = "password";
	static String DB_URL = "jdbc:mysql://localhost:3306/wallet";


	public static SimpleDriverDataSource getDatabaseConnection()  {
		dataSourceObj = new SimpleDriverDataSource();
		try {           

			dataSourceObj.setDriver(new com.mysql.jdbc.Driver());

			dataSourceObj.setUrl(DB_URL);

			dataSourceObj.setUsername(DB_USERNAME);

			dataSourceObj.setPassword(DB_PASSWORD);
		} catch(SQLException sqlException) {
			sqlException.printStackTrace();
		}
		return dataSourceObj;
	}

}
