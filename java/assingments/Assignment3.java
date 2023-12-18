package assingments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment3 {

	public static void main(String[] args) throws InterruptedException {
			
   System.setProperty("webdriver.chrome.driver", "C:\\Users\\dhilipan.murugan\\Downloads\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@name=\'name\']")).sendKeys("Dhilipan Murugan");
		
		driver.findElement(By.xpath("//input[@name=\'email\']")).sendKeys("test@gmail.com");
		
		driver.findElement(By.xpath("//input[@type=\'password\']")).sendKeys("Password@001");
		
		driver.findElement(By.id("exampleCheck1")).click();
		
		driver.findElement(By.xpath("//option[normalize-space(text())=\'Male\']")).click();
		
		driver.findElement(By.xpath("//label[normalize-space(text())=\'Student\']")).click();
		
		driver.findElement(By.name("bday")).sendKeys("11-07-2023");
		
		driver.findElement(By.xpath("//input[@type=\'submit\']")).click();
		
		Thread.sleep(2000);
				
		System.out.println(driver.findElement(By.xpath("//div[@class=\'alert alert-success alert-dismissible\']")).getText());
		
		driver.quit();
		
	}

}
