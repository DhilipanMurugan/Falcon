package com.atmecs.qa.tests;

import org.testng.annotations.Test;
import com.atmecs.qa.pages.CheckingPassFailTcPage;
import com.atmecs.qa.utils.ActionUtils;

public class FailTCTest extends ActionUtils{

	@Test(priority = 1)
	public void webServices() {

		clickOnElement(CheckingPassFailTcPage.webProject);
	}

	@Test(priority = 2)
	public void viewandClickDashboardToggles() {

		clickOnElement(CheckingPassFailTcPage.dashboardToggle);	
	}

	@Test(priority = 3)
	public void selectStatusFail() {

		clickOnElement(CheckingPassFailTcPage.selectStatus);
		
		waitforElement(CheckingPassFailTcPage.selectFail);
		
		clickOnElement(CheckingPassFailTcPage.selectFail);
	}

	@Test(priority = 4)
	public void checkFailSteps() throws InterruptedException {

		try {
			
			clickOnElement(CheckingPassFailTcPage.invalidLoginStep);

			waitforElement(CheckingPassFailTcPage.failScreenshot);
			
			clickOnElement(CheckingPassFailTcPage.failScreenshot);
			
			for (String handle : driver.getWindowHandles()) {

				driver.switchTo().window(handle);
				
				clickOnElement(CheckingPassFailTcPage.failScreenshotbt);

				clickOnElement(CheckingPassFailTcPage.errorSlide);
				
				break;
			}
		} catch (Exception exception) {
			exception.printStackTrace();
		}
	}
}
