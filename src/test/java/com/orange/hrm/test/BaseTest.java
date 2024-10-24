package com.orange.hrm.test;

import com.orange.hrm.report.ExtentReportUtils;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeSuite;

public class BaseTest {
	
	public static WebDriver driver;
	//public static RemoteWebDriver driver;
	
	@BeforeSuite
	
	public void initDriver() {
		
		
//		ChromeOptions browserOptions = new ChromeOptions();
//		browserOptions.setPlatformName("Windows 11");
//		browserOptions.setBrowserVersion("latest");
//		Map<String, Object> sauceOptions = new HashMap<>();
//		sauceOptions.put("username", "oauth-manidipta11-141eb");
//		sauceOptions.put("accessKey", "3dfe4e89-10db-4d7f-bd7d-ab1c83406d94");
//		sauceOptions.put("build", "selenium-build-D26ND");
//		sauceOptions.put("name", "Sanity Test");
//		browserOptions.setCapability("sauce:options", sauceOptions);
//		
//		// start the session
//		URL url = null;
//		
//		try {
//			url = new URL("https://ondemand.us-west-1.saucelabs.com:443/wd/hub");
//		} catch (MalformedURLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		driver = new RemoteWebDriver(url, browserOptions);

		// run commands and assertions
//		driver.get("https://saucedemo.com");
//		String title = driver.getTitle();
//		boolean titleIsCorrect = title.contains("Swag Labs");
//		String jobStatus = titleIsCorrect ? "passed" : "failed";
//
//		// end the session
//		driver.executeScript("sauce:job-result=" + jobStatus);
//		driver.quit();
		
		
		ExtentReportUtils.setUpReport();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
	}
	
	

}
