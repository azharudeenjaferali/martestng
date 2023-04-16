package com.aiite.pagefactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import com.aiite.basepackage.BaseClass;

public class HomePage extends BaseClass{

	public HomePage() {
		PageFactory.initElements(driver, this);
	}

	//	public static String searchBox = "twotabsearchtextbox";
	//	public static String goSearchBtn = "//input[@type='submit']";

	@FindBy(id="twotabsearchtextbox")
	private WebElement searchBox;

	@FindBy(xpath="//input[@type='submit']")
	private WebElement goSearchBtn;

	public WebElement getSearchBox() {
		return searchBox;
	}

	public WebElement getGoSearchBtn() {
		return goSearchBtn;
	}
		

//	@FindAll({			//@FindBys
//		@FindBy(id="twotabsearchtextbox"),
//		@FindBy(xpath = "//input[@type='submit']")
//	} )
//	public WebElement searchBox2;

}
