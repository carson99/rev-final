package com.app.dbutil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.apache.log4j.Logger;
import com.app.service.LogService;

import com.app.customerdao.impl.CustomerDAOImpl;

public class PostgresConnection {
	private static Logger log=Logger.getLogger(CustomerDAOImpl.class);
	
	private static Connection connection;
	
	private PostgresConnection() {
	}
	public static Connection getConnection() throws ClassNotFoundException, SQLException {
		
		if(connection==null) {
		Class.forName("org.postgresql.Driver");
		log.debug("Driver loaded successfully");		
		String url="jdbc:postgresql://localhost:5432/postgres";
		String username="postgres";
		String password="Gearringsporcelainpen5";
		connection=DriverManager.getConnection(url, username, password);
		return connection;
		} else {
			return connection;
		}
		}
	}


