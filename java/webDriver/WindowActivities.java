package webDriver;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class WindowActivities {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dhilipan.murugan\\Downloads\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("http://google.com");

		driver.navigate().to("https://amazon.com");

		driver.navigate().back();

		driver.navigate().forward();

	}

}
