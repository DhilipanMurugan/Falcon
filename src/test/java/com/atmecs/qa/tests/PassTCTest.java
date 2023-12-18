package com.atmecs.qa.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.atmecs.qa.pages.CheckingPassFailTcPage;
import com.atmecs.qa.utils.ActionUtils;

public class PassTCTest extends ActionUtils {

	@Test(priority = 1)
	public void webServices() {

		clickOnElement(CheckingPassFailTcPage.webProject);

	}

	@Test(priority = 2)
	public void viewandClickDashboardToggles() {

		clickOnElement(CheckingPassFailTcPage.dashboardToggle);
		
	}

	@Test(priority = 3)
	public void selectStatusPass() {

		clickOnElement(CheckingPassFailTcPage.selectStatus);
		
		waitforElement(CheckingPassFailTcPage.selectPass);
		
		clickOnElement(CheckingPassFailTcPage.selectPass);
		
	}

	@Test(priority = 4)
	public void checkingError() {

		try {
			clickOnElement(CheckingPassFailTcPage.loginTestStep);
			
			waitforElement(CheckingPassFailTcPage.errorSlide);
			
			clickOnElement(CheckingPassFailTcPage.errorSlide);
			
			String text = getTextFromWebelement(CheckingPassFailTcPage.erroredText);

			Assert.assertTrue(text.isBlank(), "Test failed");
			
		} catch (Exception exception) {
			exception.printStackTrace();
		}
	}
}