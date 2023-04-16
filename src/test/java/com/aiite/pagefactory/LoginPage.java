package com.aiite.pagefactory;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aiite.basepackage.BaseClass;

public class LoginPage extends BaseClass {
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	
//	public static String userName = "email";  //locator
//	public static String passWord = "pass";
//	public static String loginBtn = "//button[@name='login']";
	
//	@FindBy    //driver.findElement(By)
		
//	WebElement userName = driver.findElement(By.id("email"));
	@FindBy(id="email")
	public WebElement userName;	
	
//	WebElement passWord = driver.findElement(By.id("pass"));
	@FindBy(id="pass")
	public WebElement passWord;
	
	@FindBy(xpath="//a[text()='Facebook Lite']")
	public WebElement messengerLink;
	
//	WebElement loginBtn = driver.findElement(By.xpath("//button[@name='login']"));
	@FindBy(xpath="//button[@name='login']")
	public WebElement loginBtn;
	
	@FindBy(tagName="a")
	public List<WebElement> links;    //Find Elements
	
}
