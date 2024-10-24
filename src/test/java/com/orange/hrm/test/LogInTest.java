package com.orange.hrm.test;
import org.testng.annotations.Test;
import com.orange.hrm.pages.LoginPage;

public class LogInTest extends BaseTest{
	
	
	@Test
	
	public void loginWithValidUserNameAndPassword() {
		
		LoginPage loginPage = new LoginPage();
		loginPage.loginToApplication("Admin","admin123");
		
		}

}
