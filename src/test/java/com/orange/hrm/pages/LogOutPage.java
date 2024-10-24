package com.orange.hrm.pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.orange.hrm.test.BaseTest;

public class LogOutPage {
	
	@FindBy(xpath = "//i[@class='oxd-icon bi-caret-down-fill oxd-userdropdown-icon']")
	WebElement logOutIcon;
	
	@FindBy(xpath = "//a[text() = 'Logout']")
	WebElement logout;
	
	public LogOutPage() {
		PageFactory.initElements(BaseTest.driver, this);
	}
	
	//Click on the icon and logout
	
	public void LogOutFromThePage() {
		
		logOutIcon.click();
		logout.click();
		
	}

}
