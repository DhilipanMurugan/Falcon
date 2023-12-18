package lambdatest;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class TestingLambda {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dhilipan.murugan\\Downloads\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://www.lambdatest.com/selenium-playground");
		
		driver.findElement
		(By.xpath("//a[@class='text-black text-size-14 hover:text-lambda-900 leading-relaxed' and contains(text(),'Simple Form Demo')]")).click();	
		
		String currenturl = driver.getCurrentUrl();
		
		System.out.println(currenturl.contains("simple-form-demo"));
		
		String variable = "Welcome to Java Selenium";
		
		driver.findElement(By.xpath("//input[@id=\'user-message\']")).sendKeys(variable);
		
		driver.findElement(By.xpath("//button[@id='showInput' and contains(text(),'Get Checked Value')]")).click();
		
		Thread.sleep(3000);
		
		String message = driver.findElement(By.xpath("//p[@id=\'message\']")).getText();
		
		Assert.assertEquals(variable, message);
			
		//System.out.println(driver.getTitle());
		
		driver.close();
	
}}

