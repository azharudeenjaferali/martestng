package com.aiite.pageexecution;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.aiite.basepackage.BaseClass;
import com.aiite.pagefactory.HomePage;

public class HomePageExecution {
	
	public static Logger logger = LogManager.getLogger(HomePageExecution.class);
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("This is Before Class");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("This is After Class");
	}
	
	@Parameters({"browser"})
	@BeforeMethod
	public void beforeMethod(String browser) {
		System.out.println("Loading Url");
		BaseClass.browserLaunch(browser);
		BaseClass.loadUrl("https://www.amazon.in/");
		logger.info("Loading Url");
	}
	
	@Test
	public void laptopSearch3() {
		System.out.println("Hi");
		logger.info("Loading Url");
	}
	
	@AfterMethod
	public void afterMethod() {
		BaseClass.closeBrowser();
		System.out.println("Browser Closed");
	}

	@Test
//	(enabled=true, priority=-1)
	public void mobileSearch() {
		HomePage hp = new HomePage();
		hp.getSearchBox().sendKeys("Mobile");
		System.out.println("Test 1");
		hp.getGoSearchBtn().click();
		//Assertion
	}
	
	@Test(groups= {"smoke"})
	public void laptopSearch() {
		HomePage hp = new HomePage();
		hp.getSearchBox().sendKeys("Laptop");
		System.out.println("Test 2");
		hp.getGoSearchBtn().click();
		String orderID = "DN893840";
//		Assert.assertFalse(orderID.isEmpty());
	}
	
	
	@Test
//	(priority=-2)
	public void televisionSearch() {
		HomePage hp = new HomePage();
		hp.getSearchBox().sendKeys("Television");
		System.out.println("Test 3");
		hp.getGoSearchBtn().click();
//		Assert.assertTrue(true);
	}


}
