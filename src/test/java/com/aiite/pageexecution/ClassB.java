package com.aiite.pageexecution;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

public class ClassB {
	
	private static Logger logger = LogManager.getLogger();
	
	
	@Test
	public void testOne() {
		System.out.println("Hi");
		logger.info("Logger");
	}

}
