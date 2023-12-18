package com.atmecs.qa.tests;

import org.testng.annotations.Test;
import com.atmecs.qa.pages.RecentRunsPage;
import com.atmecs.qa.utils.ActionUtils;

public class RecentRunsTestTC7 extends ActionUtils{

	@Test(priority = 1)
	public void recentRuns() {

		jsExecutorClickUsingLocator(RecentRunsPage.recentRunsTab);
	}

	@Test(priority = 2)
	public void passPercentHeaderTest() {

		waitforElement(RecentRunsPage.deleteButton);
		jsExecutorClickUsingLocator(RecentRunsPage.deleteButton);
	}
}
