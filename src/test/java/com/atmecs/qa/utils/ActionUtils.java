package com.atmecs.qa.utils;

import java.time.Duration;
import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.atmecs.qa.basetest.BaseTest;

public class ActionUtils extends BaseTest {

//	private static final WebElement element = null;
	public static WebDriverWait wait;
	public static JavascriptExecutor jsExecutor = null;
	public static Logger logger = Logger.getLogger(BaseTest.class);
	public static Actions actions;

	public void waitforElement(String locator) {

		try {
			wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locator)));
		} catch (Exception exception) {
			logger.error("Exception" + exception);
		}
	}

	public void clickOnElement(String locator) {
		try {
			driver.findElement(By.xpath(locator)).click();
			logger.info("Element is Clicked");
		} catch (Exception exception) {
			logger.error("Element is Not Clicked" + exception);
		}
	}

	public void jsExecutorClickUsingLocator(String locator) {

		try {
			WebElement recentR = driver.findElement(By.xpath(locator));
			jsExecutor = (JavascriptExecutor)driver;
			jsExecutor.executeScript("arguments[0].click();", recentR);
		} catch (Exception exception) {
			exception.printStackTrace();
		}
	}

	public void elementDisplay(String locator) {
		try {
			driver.findElement(By.xpath(locator)).isDisplayed();
			logger.info("Element is Displayed");
		} catch (Exception exception) {
			logger.error("Element is Not Displayed" + exception);
		}
	}

	public void actionsClick(String locator) {

		try {
			actions = new Actions(driver);
			WebElement hoveredElement = driver.findElement(By.xpath(locator));
			actions.moveToElement(hoveredElement).click().perform();
		} catch (Exception exception) {
			exception.printStackTrace();
		}
	}

	public void actionsHover(String locator) {

		try {
			actions = new Actions(driver);
			WebElement hoveredElement = driver.findElement(By.xpath(locator));
			actions.moveToElement(hoveredElement).perform();
			;
		} catch (Exception exception) {
			exception.printStackTrace();
		}
	}

	public void findElement(String locator) {

		try {
			driver.findElement(By.xpath(locator));

		} catch (Exception exception) {
			exception.printStackTrace();
		}
	}

	public WebElement findElementByXpath(String locator) {
		WebElement element = null;
		try {
			element = driver.findElement(By.xpath(locator));
			// return element;
		} catch (Exception exception) {
			exception.printStackTrace();
		}
		return element;
	}

	public List<WebElement> findElements(String locator) {

		try {
			driver.findElements(By.xpath(locator));
		} catch (Exception exception) {
			exception.printStackTrace();
		}
		return null;
	}

	public String getTextFromWebelement(String locator) {

		try {
			String text = driver.findElement(By.xpath(locator)).getText();
			return text;
		} catch (Exception exception) {
			exception.printStackTrace();
		}
		return null;

	}
}
