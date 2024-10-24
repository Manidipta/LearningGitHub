package com.test;


import org.testng.annotations.Test;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginTest_Old {
	
	ChromeDriver driver;
	
	@Test
	
	public void login() {
		
		//open chrome
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		// Open Login Page
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		//Enter UserName and Passsord
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		
		//Click on the Login Button
		driver.findElement(By.xpath("//*[@id=\"app\"]//button")).click();
		
	}
	
	
	
	
	
	
	
	
	

}
