package com.atmecs.qa.tests;

import java.time.Duration;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import com.atmecs.qa.pages.RecentRunsPage;
import com.atmecs.qa.utils.ActionUtils;

public class RecentRunsTestTC5 extends ActionUtils{

	@Test(priority = 1)
	public void recentRuns() {

		jsExecutorClickUsingLocator(RecentRunsPage.recentRunsTab);

	}

	@Test(priority = 2)
	public void passPercentHeaderTest() {
		
		wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		
		waitforElement(RecentRunsPage.passRate);
		elementDisplay(RecentRunsPage.passRate);
		jsExecutorClickUsingLocator(RecentRunsPage.passRate);
		jsExecutorClickUsingLocator(RecentRunsPage.passRate);
		
		waitforElement(RecentRunsPage.firstPassPercent);
		jsExecutorClickUsingLocator(RecentRunsPage.firstPassPercent);

	}
	
}
