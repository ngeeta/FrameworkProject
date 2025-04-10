package com.LinkedIn.pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class HomePage extends BasePage {

	public HomePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath="(//button[@type='button'])[3]")
	WebElement businessButton;
	
	public void business_grid() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(businessButton));
		businessButton.click();
	}
	//Method to click on Learning
	
	@FindBy(xpath="//div[@id='ember21']")
	WebElement learning;
	
	public void moduleLearning() throws InterruptedException {
		Thread.sleep(3000);
		learning.click();
	}
	


}
