package com.aiite.pageexecution;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aiite.basepackage.BaseClass;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ClassC {
	
	public ExtentHtmlReporter reporter;
	public ExtentReports extent;
	
	@BeforeClass
	public void beforeClass() {
		reporter = new ExtentHtmlReporter("ExtentReport2.html");
		extent = new ExtentReports();
		extent.attachReporter(reporter);
	}
	
	@AfterClass
	public void afterClass() {
		extent.flush();
	}
	
	@Test
	public void testOne() {
		ExtentTest testOne = extent.createTest("testOne");
		BaseClass.browserLaunch("chrome");
		testOne.info("Browser Lauched");
		BaseClass.loadUrl("https://www.facebook.com/");
		BaseClass.closeBrowser();
		testOne.pass("Method Passed");
	}
	
	
	@Test
	public void testTwo() {
		ExtentTest testTwo = extent.createTest("testTwo");
		BaseClass.browserLaunch("edge");
		BaseClass.loadUrl("https://www.extentreports.com/");
		testTwo.info("URL Loaded successfully");
		BaseClass.closeBrowser();
		testTwo.fail("Method Failed");
	}

}
