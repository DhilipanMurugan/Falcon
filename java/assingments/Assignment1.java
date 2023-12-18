package assingments;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 {
    public static void main(String[] args) {
        // Set up ChromeDriver using WebDriverManager
        WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		driver.manage().window().maximize();

		driver.findElement(By.xpath("//input[@id=\"checkBoxOption1\"]")).click();

		System.out.println(driver.findElement(By.xpath("//input[@id=\'checkBoxOption1\']")).isSelected());

		driver.findElement(By.xpath("//input[@id=\"checkBoxOption1\"]")).click();

		System.out.println(driver.findElement(By.xpath("//input[@id=\'checkBoxOption1\']")).isSelected());

		// System.out.println(driver.findElement(By.xpath("//*[normalize-space(text())=\'Checkbox
		// Example\']")).getSize());

		System.out.println("No of elements present "
				+ driver.findElements(By.xpath("//*[@id=\"checkbox-example\"]//child::label")).size());

	}

}
