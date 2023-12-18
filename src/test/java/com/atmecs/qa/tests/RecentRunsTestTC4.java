package com.atmecs.qa.tests;

import org.testng.annotations.Test;
import com.atmecs.qa.pages.RecentRunsPage;
import com.atmecs.qa.utils.ActionUtils;

public class RecentRunsTestTC4 extends ActionUtils{

	@Test(priority = 1)
	public void recentRuns() {

		jsExecutorClickUsingLocator(RecentRunsPage.recentRunsTab);
		
	}

	@Test(priority = 2)
	public void testcasesHeaderTest() {

		waitforElement(RecentRunsPage.testCases);
		elementDisplay(RecentRunsPage.testCases);
		jsExecutorClickUsingLocator(RecentRunsPage.testCases);
		jsExecutorClickUsingLocator(RecentRunsPage.testCases);

		waitforElement(RecentRunsPage.firstTestcase);
		jsExecutorClickUsingLocator(RecentRunsPage.firstTestcase);

	}
}
