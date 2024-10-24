package com.orange.hrm.test;
import org.testng.annotations.Test;
import com.orange.hrm.pages.Homepage;

public class HomePageTest{
	
	@Test
	public void verifyAdminLink() {
		
		Homepage homePage = new Homepage();
		homePage.AdminLinkVisible();
	}
	
	
	
	

}
