package com.atmecs.qa.tests;

import org.openqa.selenium.By;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import com.atmecs.qa.pages.RecentRunsPage;
import com.atmecs.qa.utils.ActionUtils;

public class RecentRunsTestTC1 extends ActionUtils{

	@Test(priority = 1)
	public void recentRuns() {
		
		jsExecutorClickUsingLocator(RecentRunsPage.recentRunsTab);
	
	}
	
	@Test(priority = 2)
	public void verifyTitle() {

		waitforElement(RecentRunsPage.recentRunsTitle);
		
		String recentRunsTitleActual = driver.findElement(By.xpath(RecentRunsPage.recentRunsTitle)).getText();
		System.out.println(recentRunsTitleActual);

		String recentRunsTitleExpected = "Recent Runs";
		System.out.println(recentRunsTitleExpected);

		AssertJUnit.assertEquals(recentRunsTitleActual, recentRunsTitleExpected);

	}

	@Test(priority = 3)
	public void productName() {

		elementDisplay(RecentRunsPage.productName);
		
	}

	@Test(priority = 4)
	public void components() {

		elementDisplay(RecentRunsPage.component);
		
	}

	@Test(priority = 5)
	public void testCases() {

		elementDisplay(RecentRunsPage.testCases);
		
	}

	@Test(priority = 6)
	public void passPercent() {
		
		elementDisplay(RecentRunsPage.passRate);

	}

	@Test(priority = 7)
	public void lastRun() {

		elementDisplay(RecentRunsPage.lastRun);
		
	}
}
