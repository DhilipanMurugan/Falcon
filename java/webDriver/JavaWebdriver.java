package webDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaWebdriver {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dhilipan.murugan\\Downloads\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		System.out.println(driver.getTitle());
		
		driver.close();
		
	}

}
