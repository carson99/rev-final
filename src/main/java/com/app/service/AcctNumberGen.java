package com.app.service;

import java.util.Random;

import org.apache.log4j.Logger;

import com.app.dao.LogDAO;

public class AcctNumberGen {

	private static Logger log=Logger.getLogger(AcctNumberGen.class);
	public static void main(String[] args) {
		Random r=new Random();
		int i=r.nextInt(90000)+10000;
			log.debug(i);
			
		Random r2=new Random();
		int i2=r2.nextInt(9000)+1000;
			log.debug(i2);

	}

}
