package com.orange.hrm.pages;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.orange.hrm.report.ExtentReportUtils;
import com.orange.hrm.test.BaseTest;

public class LoginPage {
	
	//User Name
	@FindBy(name = "username")
	WebElement userNameTextBox;
	
	//Password
	@FindBy(name = "password")
	WebElement passwordTextBox;
	
	//Login Button
	@FindBy(xpath = "//*[@id=\"app\"]//button")
	WebElement loginButton;
	
	public LoginPage() {
		PageFactory.initElements(BaseTest.driver, this);
	}
	
	// this -> current object of the class 
	
	Logger log  = LogManager.getLogger(LoginPage.class);
	
	public void loginToApplication(String userName, String password ) {
		
		userNameTextBox.sendKeys(userName);
		log.info("User Name entered");
		ExtentReportUtils.addStep("User Name is Entered");
		
		
		passwordTextBox.sendKeys(password);
		log.info("password entered");
		ExtentReportUtils.addStep("Password is Entered");
		
		loginButton.click();
		log.info("clicked in the Login button");
		ExtentReportUtils.addStep("Login Button is Clicked");
		
		}

}
