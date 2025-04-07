package com.LinkedIn.pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
WebDriver driver;
WebDriverWait wait;

//Constructor to initialize Webdriver & webDriverWait with default 30 Sec
public BasePage(WebDriver driver) {
	
	this.driver=driver;
	PageFactory.initElements(driver, this);
	this.wait=new WebDriverWait(driver, Duration.ofSeconds(30));
}

//Explicitly wait for Visibility Of element
public void waitForVisibilityOfElement(WebElement element) {
	wait.until(ExpectedConditions.visibilityOf(element));
}
//Explicitly wait for element to be clickable
public void waitForElementToBeClickable(WebElement element) {
	wait.until(ExpectedConditions.elementToBeClickable(element));
}

}
