package com.atmecs.qa.tests;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import com.atmecs.qa.pages.DashboardPage;
import com.atmecs.qa.utils.ActionUtils;
import com.atmecs.qa.utils.Utils;

public class DashboardTest extends ActionUtils {

	@Test(priority = 1)
	public void assertUrl() {

		String actualURL = driver.getCurrentUrl();
		String expectedURL = (Utils.readLocators("baseURL"));
		AssertJUnit.assertEquals(actualURL, expectedURL);
	}

	@Test(priority = 2)
	public void assertTitle() {

		String actualTitle = driver.getTitle();
		String expectedTitle = (DashboardPage.expectedTitle);
		AssertJUnit.assertEquals(expectedTitle, actualTitle);
	}

	@Test(priority = 3)
	public void maximizeButton() {
		waitforElement(DashboardPage.maximizeKey);
		actionsClick(DashboardPage.maximizeKey);
	}

	@Test(priority = 4)
	public void refreshButton() {

		elementDisplay(DashboardPage.refreshButton);
	}

	@Test(priority = 5)
	public void projectsPresent() {

		List<WebElement> elements = driver.findElements(By.xpath(DashboardPage.projectsList));
		for (int i = 0; i < elements.size(); i++) {
			System.out.println(elements.get(i).getText());
		}
		
		Assert.assertTrue(elements.isEmpty(), "Projects are not prensent - Test failed");
	}

	@Test(priority = 6)
	public void barcodeLocator() {

		actionsClick(DashboardPage.barcodeBar);
	}

	@Test(priority = 7)
	public void lastRunTitle() {

		elementDisplay(DashboardPage.lastRunTitle);
	}

	@Test(priority = 8)
	public void lastRunStatus() {

		elementDisplay(DashboardPage.lastRunStatus);
	}

	@Test(priority = 9)
	public void totalTestCaseIcon() {

		elementDisplay(DashboardPage.totalTestcaseICon);
	}

	@Test(priority = 10)
	public void hoverTotalTestCaseIcon() {

		actionsHover(DashboardPage.totalTestcaseCount);

		getTextFromWebelement(DashboardPage.hoverTotalTestcases);
	}

	@Test(priority = 11)
	public void passedandFailedBar() {

		elementDisplay(DashboardPage.passedFailBar);
	}

	@Test(priority = 12)
	public void passedRateColour() {
		
		WebElement passedbar = findElementByXpath(DashboardPage.passedRateColour);
		String passedbarColor = passedbar.getCssValue("color");
		System.out.println(passedbarColor);
	}

	@Test(priority = 13)
	public void failedRateColour() {
		
		WebElement failedbar = findElementByXpath(DashboardPage.failedRateColour);
		String failedbarColor = failedbar.getCssValue("color");
		System.out.println(failedbarColor);
	}

	@Test(priority = 14)
	public void hoverPassedRateBar() {

		actionsHover(DashboardPage.passedRateColour);
	}

	@Test(priority = 15)
	public void hoverFailedRateBar() {

		actionsHover(DashboardPage.failedRateColour);

	}

	@Test(priority = 16)
	public void hoverProductSnapshot() {

		waitforElement(DashboardPage.snapShotButton);
		actionsClick(DashboardPage.snapShotButton);
		waitforElement(DashboardPage.viewSnapShotPopup);
		clickOnElement(DashboardPage.viewSnapShotPopup);
	}
}
