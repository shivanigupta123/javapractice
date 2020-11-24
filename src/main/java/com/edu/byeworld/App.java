package com.edu.byeworld;

import java.util.Date;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

/**
 * Hello world!
 * Level of logging
 * 1) DEBUG 2)INFO 3)WARM 4) ERROR 5)FATAL
 */
public class App {
	//static Logger log = Logger.getLogger(App.class.getName());
	static Logger log = LogManager.getLogger(App.class.getName());

	public static void main(String[] args) {

		System.out.println("Bye World Branch merge testing!--> SUmit COmmit by shivani");

		PropertyConfigurator.configure("log4j.properties");
		//if(log.isDebugEnabled()) 
		log.debug("Hello this is a debug message: " + new Date().toString());//
		log.info("Hello this is an info message " + new Date().toString()); // transation successful
	    log.warn("Hello this is an warn message " + new Date().toString()); //
	    log.error("Hello this is an error message " + new Date().toString());//
	    log.fatal("Hello this is an fatal message " + new Date().toString());
	    log.trace("Hello this is an trace message " + new Date().toString());
	    log.trace("Git Test Hello this is an trace message " + new Date().toString());

	}
}
