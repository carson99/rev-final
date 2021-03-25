package com.app.service;

import org.apache.log4j.Logger;

import com.app.dao.LogDAO;


public class LogService {
	
	private static Logger log=Logger.getLogger(LogService.class);
	
	private LogDAO dao=new LogDAO();
	public void helloLogService() {
		log.info("hello from LogService");
		//something
		log.info("bye from LogService");
	}

}
