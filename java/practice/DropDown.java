package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown {

	
	public WebDriver driver;
	@BeforeTest
	public void launchUrl() {
		
        WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver();
        
        driver.manage().window().maximize();
        
        driver.get("https://formstone.it/components/dropdown/demo/");
		
	}
	
	@Test
	public void dropDown1() {
		
		WebElement dropDownButton1 = 
				driver.findElement(By.xpath("//select[@id='demo_basic']"));
			
		Select select = new Select(dropDownButton1);
		
		select.selectByValue("2");
	
	}	
	
public void dropDown2() {
		
		WebElement dropDownButton1 = 
				driver.findElement(By.xpath("//select[@id='demo_groups']"));
			
		Select select = new Select(dropDownButton1);
		
		select.selectByVisibleText("Seven");
	
	}	
	}
