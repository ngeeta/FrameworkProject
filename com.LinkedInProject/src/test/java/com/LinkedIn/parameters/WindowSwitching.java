package com.LinkedIn.parameters;

import java.util.Set;

import org.openqa.selenium.WebDriver;

public class WindowSwitching {

	//This method switches the driver control from main window to child window
	public void windowSwitch(WebDriver driver) {
		String mainwindow=driver.getWindowHandle();
		Set<String> window=driver.getWindowHandles();
		for(String windowHandle:window) {
			if(!windowHandle.equals(mainwindow)) {
				driver.switchTo().window(windowHandle);
				break;
			}
		}
	}
}
