package com.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.utilities.AppConstants;

public class LoginPage {
	
	private WebDriver driver;
	
	//By Locators of the Login Page
	
	
	public LoginPage(WebDriver driver){
		this.driver=driver;
	}
	
	//Login Page Methods
	
	public void launchLoginPage() {
		driver.get(AppConstants.LOGINURL);
	}
	
	
	public String getLoginPageTitle() {
		return driver.getTitle();
	}
	
	
	

}
