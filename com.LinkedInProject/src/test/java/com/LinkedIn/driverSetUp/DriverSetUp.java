package com.LinkedIn.driverSetUp;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.LinkedIn.parameters.LinkedInLoginPropertiesReader;

import io.cucumber.java.After;
import io.cucumber.java.Before;
public class DriverSetUp {
 private static ThreadLocal<WebDriver> driver=new ThreadLocal<>();
 
 //Return the Current thread's driver instance
 public static WebDriver getDriver() {
	 return driver.get();
 }
 Properties properties=new Properties();
 
 //@Before annotation marks this method to run before each scenario in cucumber
 @Before
 public void setUp() throws IOException {
	 LinkedInLoginPropertiesReader prop=new LinkedInLoginPropertiesReader();
	 //use for reading config
	 String url=prop.getProp("url");
	 String browser=prop.getProp("browser");
	 if(browser.equalsIgnoreCase("chrome")) {
		 driver.set(new ChromeDriver());
	 }else if (browser.equalsIgnoreCase("edge")) {
			 driver.set(new EdgeDriver());
			
		}
	 else if (browser.equalsIgnoreCase("firefox")) {
			 driver.set(new FirefoxDriver());
			
		}
	 else {
		 throw new IllegalArgumentException("Unsupported Browser : "+browser);
		
	}
	 //load url from configuration fiel and open it in selected browser
	 getDriver().get(url);
	 System.out.println("Driver-------"+getDriver());
	 getDriver().manage().window().maximize();
	 getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
	 }
	 
 @After
 public void tearDown() throws InterruptedException{
	 Thread.sleep(3000);
	 if(driver!=null) {
		 getDriver().quit();
	 }
 }
 
}
