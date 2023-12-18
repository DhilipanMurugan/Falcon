package com.atmecs.qa.tests;

import org.testng.annotations.Test;
import com.atmecs.qa.pages.RecentRunsPage;
import com.atmecs.qa.utils.ActionUtils;

public class RecentRunsTestTC6 extends ActionUtils{

	@Test(priority = 1)
	public void recentRuns() {

		jsExecutorClickUsingLocator(RecentRunsPage.recentRunsTab);
	}

	@Test(priority = 2)
	public void passPercentHeaderTest() {

		waitforElement(RecentRunsPage.lastRun);
		elementDisplay(RecentRunsPage.lastRun);
		jsExecutorClickUsingLocator(RecentRunsPage.lastRun);
		jsExecutorClickUsingLocator(RecentRunsPage.lastRun);
		
		waitforElement(RecentRunsPage.firstLastRun);
		jsExecutorClickUsingLocator(RecentRunsPage.firstLastRun);
		
	}
	
}
