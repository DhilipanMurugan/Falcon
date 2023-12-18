package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Flipkart {

	public WebDriver driver;
	@Test
	public void launchUrl() {
		
        WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver();
        
        driver.get("https://www.flipkart.com/");
		
	}
	
}
