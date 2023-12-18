package com.atmecs.qa.basetest;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import com.atmecs.qa.utils.Utils;

public class BaseTest {

	public static WebDriver driver ;
	
	@BeforeTest
	public void browserLaunch() {
		   WebDriver driver = new ChromeDriver();
		   driver.get(Utils.readLocators("baseURL"));
		   driver.manage().window().maximize();
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}
	
	@AfterTest
	public void tearDown() {
		
		   driver.quit();		
	}
}
