package com.org.learningMaven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class myFirstStepDefinition {

	WebDriver driver;
	@Given("^I navigate to mercury new tours\\.com$")
	public void i_navigate_to_mercury_new_tours_com() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("Navigate tours method");
		System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir") +"\\libraries\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("http://newtours.demoaut.com/");
		
	}

	@When("^I navigate to registration page$")
	public void i_navigate_to_registration_page() throws Throwable {
	
		driver.findElement(By.linkText("REGISTER")).click();
	}

	@Then("^the page title should be visible$")
	public void the_page_title_should_be_visible() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		Assert.assertEquals(driver.getTitle(), "Register: Mercury Tours");
		Assert.assertEquals(driver.getTitle(), "Register: Tours");
	}
}
