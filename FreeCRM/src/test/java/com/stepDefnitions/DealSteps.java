package com.stepDefnitions;

import java.util.List;

//import java.util.List;

import com.DealPages.DealPage;
import com.baseClasses.Library;
import com.pages.LoginPage;
import com.reusableFunctions.SeleniumUtilities;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DealSteps extends Library{
	LoginPage lp;
	DealPage dp;
	//List< List<String>> dealsfromfeature;
	
	@Given("To open application and navigate url")
	public void to_open_application_and_navigate_url() {
	  browserSetUp();
	}

	
	@When("user clicks  loginlink")
	public void user_clicks_loginlink() {
		lp=new LoginPage(driver);
		lp.clickloginlink();
	   	}

	@When("enter email and password")
	public void enter_email_and_password() {
		lp.login(properties.getProperty("email"), properties.getProperty("pass"));
	  
	}

	@Then("click  login button")
	public void click_login_button() {
		lp.click();
	    	}



	@Given("user is in the home page")
	public void user_is_in_the_home_page() {
		
	   	}

	@Then("click on deals")
	public void click_on_deals() throws InterruptedException {
	    dp=new DealPage(driver);
	    dp.dealsbutton();
	    }

	@When("click on new deals button")
	public void click_on_new_deals_button() throws InterruptedException {
	   dp.clicknewdeal();
	}

	@Then("enter the deal credentials and save")
	public void enter_the_deal_credentials_and_save(DataTable dataTable) throws InterruptedException {
	  
		 List<List<String>> dealsfromfeature = dataTable.asLists(String.class);
	    for (List<String> dealrow : dealsfromfeature) {
		 dp.DealsCredsAndSave(dealrow);
	}
	
	 
	}

	@Then("take a sceenshot")
	public void take_a_sceenshot() {
	    
	}
}
