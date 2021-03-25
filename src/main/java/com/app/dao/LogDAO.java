package com.app.dao;

import org.apache.log4j.Logger;

import com.app.service.LogService;

public class LogDAO {
	private static Logger log=Logger.getLogger(LogDAO.class);
	public void helloLogDAO() {
		log.info("hello from LogDAO");
		//something
		log.info("bye from LogDAO");
	}

}
