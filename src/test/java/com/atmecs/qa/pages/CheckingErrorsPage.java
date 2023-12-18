package com.atmecs.qa.pages;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CheckingErrorsPage {

	public static void main(String[] args) {
		
	    System.setProperty("webdriver.chrome.driver","C:\\Users\\dhilipan.murugan\\Desktop\\Falcon\\falcon\\lib\\msedgedriver.exe");  

		
		WebDriver driver = new EdgeDriver();
		
		driver.get("https://www.google.com/");
		
	}
	
}
