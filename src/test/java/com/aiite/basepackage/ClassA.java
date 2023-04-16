package com.aiite.basepackage;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ClassA {
	
	public static void main(String[] args) {
		ExtentHtmlReporter extentreporter = new ExtentHtmlReporter("extent.html");
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(extentreporter);
		
		ExtentTest createTest = extent.createTest("Test1");
		BaseClass.browserLaunch("chrome");
		createTest.info("launching url");
		BaseClass.loadUrl("https://www.facebook.com/");
		BaseClass.closeBrowser();
		createTest.pass("completed succesfully");
		
		
		ExtentTest createTest2 = extent.createTest("Test2");
		BaseClass.browserLaunch("chrome");
		createTest2.debug("Launching amazon site");
		BaseClass.loadUrl("https://www.amazon.in/");
		BaseClass.closeBrowser();
		createTest2.fail("unsuccessful");
		
		extent.flush();
		
	}

}
