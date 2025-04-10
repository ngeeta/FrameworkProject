package com.LinkedIn.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LinkedInPage extends BasePage {

	public LinkedInPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath="//a[normalize-space()='Sign in']")
	static WebElement signinbtn;
	
	public void SignInBtn() {
		signinbtn.click();
	}
	
	
}
