package com.atmecs.qa.tests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.atmecs.qa.pages.DashboardPage;
import com.atmecs.qa.pages.DashboardTogglePage;
import com.atmecs.qa.utils.ActionUtils;

public class DashboardToggleTest extends ActionUtils{


	@Test(priority = 1)
	public void projectsPresent() {

		List<WebElement> elements = driver.findElements(By.xpath(DashboardPage.projectsList));

		Assert.assertFalse(elements.isEmpty());
	}

	@Test(priority = 2)
	public void webServices() {

		clickOnElement(DashboardTogglePage.webProject);	
	}

	@Test(priority = 3)
	public void viewandClickDashboardToggles() {

		elementDisplay(DashboardTogglePage.dashboardToggle);
		
		clickOnElement(DashboardTogglePage.dashboardToggle);
	}

	@Test(priority = 4)
	public void verifyEnvironment() {

		elementDisplay(DashboardTogglePage.environment);
	}

	@Test(priority = 5)
	public void verifyTestPhase() {

		elementDisplay(DashboardTogglePage.testPhase);
	}

	@Test(priority = 6)
	public void verifyStartTime() {

		elementDisplay(DashboardTogglePage.startTime);
	}

	@Test(priority = 7)
	public void verifyEndtime() {

		elementDisplay(DashboardTogglePage.endTime);
	}

	@Test(priority = 8)
	public void verifyTestandRun() {

		elementDisplay(DashboardTogglePage.totalTests);
	}

	@Test(priority = 9)
	public void clickTotalTests() {

		clickOnElement(DashboardTogglePage.totalTestsIcon);
	}

	@Test(priority = 10)
	public void verifyPassTestcases() {

		elementDisplay(DashboardTogglePage.passTests);
	}

	@Test(priority = 11)
	public void clickPassTestcases() {

		clickOnElement(DashboardTogglePage.passTestsIcon);
	}

	@Test(priority = 12)
	public void verifyFailTestcases() {
		
		elementDisplay(DashboardTogglePage.failTests);
	}

	@Test(priority = 13)
	public void clickFailTestcases() {

		clickOnElement(DashboardTogglePage.failTestsIcon);
	}

	@Test(priority = 14)
	public void verifySkipTestcases() {

		elementDisplay(DashboardTogglePage.skipTests);
	}

	@Test(priority = 15)
	public void clickSkipTestcases() {

		clickOnElement(DashboardTogglePage.skipTestsIcon);
	}
}