package practice;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TakeScreenshot {

	 public WebDriver driver;
	@Test
	public void launchUrl() {
		
        WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver();
        
        driver.get("https://www.google.com/");
		
	}
	@Test
	public void takeScreenshot() throws IOException {
		
		File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			
		FileUtils.copyFile(screenshot, new File("C:\\Users\\dhilipan.murugan\\Pictures\\Screenshots\\Screenshot1.jpg"));
		
		driver.quit();
		
	}
	
	
}
