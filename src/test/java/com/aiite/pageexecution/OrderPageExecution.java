package com.aiite.pageexecution;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class OrderPageExecution {
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("This is Before Class");
		System.out.println(2/0);
	}
	
	@AfterClass(alwaysRun=true)
	public void afterClass() {
		System.out.println("This is After Class");
	}
	
	@Test(groups= {"smoke"})
	public void testOne() {
		System.out.println("Test One");
	}
	
	@Test
	public void testTwo() {
		System.out.println("Test Two");
	}
	
	@Test
	public void testThree() {
		System.out.println("Test Three");
	}

}
