package com.LinkedIn.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;

import com.LinkedIn.parameters.LinkedInLoginPropertiesReader;

public class SignInPage extends BasePage {
static LinkedInLoginPropertiesReader prop;
	public SignInPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath="//*[@id='username']")
	static WebElement username;
	//Method to Enter username 
	
	public void userName() {
		username.sendKeys(prop.getProp("username"));
	}
	
	@FindBy(xpath="//*[@id='password']")
	static WebElement password;
	public void password() {
		username.sendKeys(prop.getProp("password"));
	}
	
	@FindBy(xpath="//button[normalize-space()='Sign in']")
	static WebElement signin;
	public void signIn() throws InterruptedException {
		signin.click();
		Thread.sleep(2000);
	}
}
