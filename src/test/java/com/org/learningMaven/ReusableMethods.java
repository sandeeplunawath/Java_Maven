package com.org.learningMaven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ReusableMethods {

	public WebDriver driver;
	
	public void Login()
	{		
		System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir") +"\\libraries\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("http://newtours.demoaut.com/");
	}
	
	
	public void Logout()
	{
		
		driver.quit();
	}
}
