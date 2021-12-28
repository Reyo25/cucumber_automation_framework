package com.stepdefinitions;

import com.factory.DriverFactory;
import com.pageobjects.LoginPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class LoginPageSD {
	
	private static String actualPageTitle;
	
	LoginPage loginpo= new LoginPage(DriverFactory.getDriver());
	
	@Given("user is on login page")
	public void user_is_on_login_page() {
		loginpo.launchLoginPage(); 
	}

	@When("user gets the title of page")
	public String user_gets_the_title_of_page() {
		actualPageTitle= loginpo.getLoginPageTitle();
		return actualPageTitle;
	}

	@Then("forgot password link should be displayed")
	public void forgot_password_link_should_be(){
		
	}
	
	@Then("landing page title should be {string}")
	public void landing_page_title_should_be(String expectedTitle) {
	    Assert.assertTrue(actualPageTitle.equals(expectedTitle));
	}
	
	

	@When("user enters username {string}")
	public void user_enters_usrname(String string) {
	    
	}

	
	@When("user enters password {string}")
	public void user_enters_password(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("user clicks on Login button")
	public void user_clicks_on_login_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	
	
}