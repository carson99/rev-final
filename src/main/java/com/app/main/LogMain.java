package com.app.main;

import org.apache.log4j.Logger;

import com.app.service.LogService;

public class LogMain {

	private static Logger log=Logger.getLogger(LogMain.class);
	public static void main (String[] args) {
		
		log.info("Welcome to the Priamhark Bank application.");
		
		LogService service=new LogService();
		log.info("Making call to LogService");
		service.helloLogService();
		log.info("Completed call from LogService");
		 
		
	}
}
