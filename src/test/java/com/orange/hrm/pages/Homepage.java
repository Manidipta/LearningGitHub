package com.orange.hrm.pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.orange.hrm.test.BaseTest;

public class Homepage {
	
	//admin
	@FindBy(xpath = "//span[text()='Admin']")
	WebElement adminLink;
	
	public Homepage() {
		PageFactory.initElements(BaseTest.driver, this);
	}
	
	//Admin link is visible
	public void AdminLinkVisible() {
		
		Assert.assertTrue(adminLink.isDisplayed());
		
	}

}
