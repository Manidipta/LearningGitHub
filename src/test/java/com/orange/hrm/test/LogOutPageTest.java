package com.orange.hrm.test;

import org.testng.annotations.Test;
import com.orange.hrm.pages.LogOutPage;

public class LogOutPageTest{
	
	@Test
	
	public void logOut() {
		
		LogOutPage logOutPage = new LogOutPage();
		logOutPage.LogOutFromThePage();
	}
	
	

}
