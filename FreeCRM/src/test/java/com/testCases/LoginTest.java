package com.testCases;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.baseClasses.Library;
import com.pages.LoginPage;
import com.reusableFunctions.SeleniumUtilities;


public class LoginTest extends Library{
	
	@BeforeTest
	public void startup() {
	browserSetUp();
    logger.info("******Browse setup******");
	}
	@Test
	public void log() {
		LoginPage lp =new LoginPage(driver);
		lp.login(properties.getProperty("mail"), properties.getProperty("pass"));
				
				}
	@AfterTest
	public void teardown() {
		SeleniumUtilities seluti =new SeleniumUtilities(driver);
		seluti.to_take_screenshot("src/test/resources/ScreenShots/crmlogin");
		logger.info("****shot taken****");
		teardown();
		
	}
	
	
}

