package com.aiite.pageexecution;

import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.aiite.basepackage.BaseClass;
import com.aiite.pagefactory.HomePage;


@Listeners({com.aiite.pageexecution.ListenersImp.class})
public class SummaryExecution {
	
//	@BeforeSuite
//	public void beforeSuite() {
//		System.out.println("DB connection - Open");
//	}
//	
//	@AfterSuite
//	public void afterSuite() {
//		System.out.println("DB connection - Close");
//	}
//	
//	
//	@BeforeTest
//	public void beforeTest() {
//		System.out.println("Test Started - 01");
//	}
//	
//	@AfterTest
//	public void afterTest() {
//		System.out.println("Test Execution completed - Summary");
//	}
	
//	@Parameters({"User"})
//	@Test(enabled=false, groups= {"sanity"})
//	public void testOne(String user) {
//		System.out.println("Test One");
//		System.out.println(user);
//	}
	
//	@Test(groups= {"smoke"})
//	public void testTwo() {
//		System.out.println("Test Two");
//	}	
//	
//	
	@Test(retryAnalyzer = ListenersImp.class)
	public void mobileSearch() {
		BaseClass.browserLaunch("chrome");
		BaseClass.loadUrl("https://testng.org/doc/documentation-main.html#parameters");
		BaseClass.closeBrowser();
	}
	
	@Test(retryAnalyzer = ListenersImp.class)
	public void mobileSearch2() {
		BaseClass.browserLaunch("chrome");
		BaseClass.loadUrl("https://testng.org/doc/documentation-main.html#parameters");
		BaseClass.closeBrowser();
	}
	
	@Test(retryAnalyzer = ListenersImp.class)
	public void mobileSearch3() {
		BaseClass.browserLaunch("chrome");
		BaseClass.loadUrl("https://testng.org/doc/documentation-main.html#parameters");
		BaseClass.closeBrowser();
//		Assert.assertTrue(false);
	}

}
