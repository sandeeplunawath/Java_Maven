package com.org.learningMaven;

import org.testng.annotations.Test;

public class HelloWorldTest extends ReusableMethods {

	@Test	
	public void TestMethodSample()
	{
		System.out.println("Login into the application");
		Login();
	}

}
