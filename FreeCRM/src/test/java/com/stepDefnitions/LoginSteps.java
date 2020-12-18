package com.stepDefnitions;

import com.baseClasses.Library;
import com.pages.LoginPage;
import com.reusableFunctions.SeleniumUtilities;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps extends Library {
	LoginPage lpage ;
	@Given("To open the application and navigate url")
	public void to_open_the_application_and_navigate_url() {
	    browserSetUp();
	    logger.info("***browser launch*****");
	}
	@When("user clicks on loginlink")
	public void user_clicks_on_loginlink() {
		lpage = new LoginPage(driver);
	   lpage.clickloginlink();
	}

	@When("user enters email and password")
	public void user_enters_email_and_password() {
		
		lpage.login(properties.getProperty("email"),properties.getProperty("pass"));
	    
	}

	@Then("click on login button")
	public void click_on_login_button() {
	   lpage.click();
	}


	@Given("user is logged in the application")
	public void user_is_logged_in_the_application() {
	   
	}

	@Then("verify the user name")
	public void verify_the_user_name() {
	   
	}

	@Then("take a screenshot")
	public void take_a_screenshot() {
		SeleniumUtilities selutl =new SeleniumUtilities(driver);
		selutl.to_take_screenshot("src/test/resources/ScreenShots/CRM.png");
	}

	@Then("logout from the application")
	public void logout_from_the_application() {
		lpage.logout1();
	    
	}

	@Then("close the browser")
	public void close_the_browser() {
		tearDown();
	   
	}
}

/*	@Given("To open the application and navigate url")
	public void to_open_the_application_and_navigate_url() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("user clicks on loginlink")
	public void user_clicks_on_loginlink() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("user enters email and password")
	public void user_enters_email_and_password() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("click on login button")
	public void click_on_login_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Given("user is logged in the application")
	public void user_is_logged_in_the_application() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("take a screenshot")
	public void take_a_screenshot() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("logout from the application")
	public void logout_from_the_application() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("close the browser")
	public void close_the_browser() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}




}*/
