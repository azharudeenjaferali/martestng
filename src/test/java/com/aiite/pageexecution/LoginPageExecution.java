package com.aiite.pageexecution;

import java.io.IOException;
import java.util.Arrays;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.aiite.basepackage.BaseClass;
import com.aiite.pagefactory.LoginPage;

public class LoginPageExecution {
	
	@Parameters({ "browser" })
	@BeforeMethod
	public void beforeMethod(String browser) throws IOException {
		System.out.println("Loading Url");
		BaseClass.browserLaunch(browser);
		BaseClass.loadUrl(BaseClass.readProperty("accountUrl"));
	}
	
	@AfterMethod
	public void afterMethod() {
		BaseClass.closeBrowser();
		System.out.println("Browser Closed");
	}
	
	@BeforeGroups("smoke")
	public void beforeGroups() {
		System.out.println("Executing TCs from this group");
	}
	
	@AfterGroups("smoke")
	public void afterGroups() {
		System.out.println("After group");
	}
	
	
	@Parameters({ "browser" })
	@Test(groups= {"smoke", "sanity"})
	public void simpleOne(String browser) {
		System.out.println(browser);
	}
//	
//	@Test(dependsOnMethods= {"simpleOne"}, alwaysRun=true)
//	public void simpleTwo() {
//		System.out.println("Hi");
//		Assert.assertFalse(true);
//	}
	
//	public void methodOne() {
//		int[] arr = {10,20,30}; //by value
//		
//		int[][] brr= new int[2][2]; //by size
//		brr[0][0]=10;
//		brr[0][1]=20;
//		brr[1][0]=30;
//		brr[1][1]=40;
//		
//		int[][] crr= {{10,20},{30,40}};
//		
//		System.out.println(Arrays.deepToString(crr));
//	}
	
	@DataProvider(name="TestData", parallel=true)
	public Object[][] generateData(){
		return new Object[][] {{"Gokhul", "Abc@123"}, {"Monica", "Welcome!"}, {"Akram", "Welcome!"}};
	}
	
	@Test(dataProvider = "TestData")
	public void loginValidCredential(String username, String password) throws IOException{
		LoginPage lp = new LoginPage();
		lp.userName.sendKeys(username);
		lp.passWord.sendKeys(password);
		lp.loginBtn.click();
		System.out.println("Method One");
		Assert.assertTrue(true);
	}

}
