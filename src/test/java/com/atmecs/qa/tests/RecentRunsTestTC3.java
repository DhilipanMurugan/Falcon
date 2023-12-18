package com.atmecs.qa.tests;

import org.testng.annotations.Test;
import com.atmecs.qa.pages.RecentRunsPage;
import com.atmecs.qa.utils.ActionUtils;

public class RecentRunsTestTC3 extends ActionUtils {

	@Test(priority = 1)
	public void recentRuns() {

		jsExecutorClickUsingLocator(RecentRunsPage.recentRunsTab);
		
	}

	@Test(priority = 2)
	public void ComponentsHeaderTest() {
		
		waitforElement(RecentRunsPage.productName);
		elementDisplay(RecentRunsPage.component);
		jsExecutorClickUsingLocator(RecentRunsPage.component);
		jsExecutorClickUsingLocator(RecentRunsPage.component);

		waitforElement(RecentRunsPage.firstComponent);
		jsExecutorClickUsingLocator(RecentRunsPage.firstComponent);

	}
}
