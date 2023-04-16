package com.aiite.basepackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public static WebDriver driver;
	
	public static void browserLaunch(String browser) {
		if(browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().window().maximize();
		}
		
		else if(browser.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			driver.manage().window().maximize();
		}
		
	}
	
	public static void loadUrl(String url) {
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
//	public static WebElement searchElementById(String id) {
//		return driver.findElement(By.id(id));
//	}
//	
//	public static WebElement searchElementByXpath(String xpath) {
//		return driver.findElement(By.xpath(xpath));
//	}
	
	public static String readProperty(String key) throws IOException {
		File file = new File("C:\\Users\\user\\eclipse-workspace\\BankingProject\\src\\test\\resources\\Credentials.properties");
		FileInputStream fis = new FileInputStream(file);
		Properties prop = new Properties();
		prop.load(fis);
		String value = prop.getProperty(key);
		return value;
	}
	
	public static String getCurrentUrl() {
		return driver.getCurrentUrl();
	}
	
	public static void closeBrowser() {
		driver.quit();
	}

}
