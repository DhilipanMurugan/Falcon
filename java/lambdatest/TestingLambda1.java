package lambdatest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class TestingLambda1 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dhilipan.murugan\\Downloads\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		Actions actions = new Actions(driver);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.lambdatest.com/selenium-playground");
		
		driver.findElement
		(By.xpath("//a[@class='text-black text-size-14 hover:text-lambda-900 leading-relaxed' and contains(text(),'Drag & Drop Sliders')]")).click();
	
		WebElement dragger = driver.findElement(By.xpath("//*[@id='slider3']/div/input"));
		
		 int width = dragger.getSize().getWidth();

	        WebElement handle = driver.findElement(By.id("slider3"));


	        int offset = (int) (12 * 14); // Example: Move the slider to 50% of its width

	        Action action = actions.clickAndHold(handle)
	                                .moveByOffset(offset, 0)
	                                .release()
	                                .build();
	        action.perform();
}

}