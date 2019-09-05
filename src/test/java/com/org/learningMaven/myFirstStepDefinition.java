package com.org.learningMaven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import cucumber.api.CucumberOptions;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features =  "classpath:com/org/learningMaven/myFirstFeature.feature", plugin = "json:target/cucumber-report.json")
public class myFirstStepDefinition extends AbstractTestNGCucumberTests {

	WebDriver driver;
	@Given("^I navigate to Google\\.com$")
	public void i_navigate_to_mercury_new_tours_com() throws Throwable {
		System.out.println("Navigate tours method");
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") +"\\libraries\\chromedriver.exe");
		 
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
	}

	@When("^I navigate to search page$")
	public void i_navigate_to_registration_page() throws Throwable {
	
		driver.findElement(By.name("q")).sendKeys("selenium");
		
	}

	@Then("^the page title should be visible$")
	public void the_page_title_should_be_visible() throws Throwable {
		Assert.assertEquals(driver.getTitle(), "Google");
	}
	@Then("^Close Browser$")
	public void close_Browser() throws Throwable {
	  driver.quit();
	}

	
}
