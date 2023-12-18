package com.atmecs.qa.tests;

import org.testng.annotations.Test;
import com.atmecs.qa.pages.RecentRunsPage;
import com.atmecs.qa.utils.ActionUtils;

public class RecentRunsTestTC2 extends ActionUtils{

	@Test(priority = 1)
	public void recentRuns() {

		jsExecutorClickUsingLocator(RecentRunsPage.recentRunsTab);
	}


	@Test(priority = 2)
	public void productnameHeaderTest(){

		waitforElement(RecentRunsPage.productName);
		elementDisplay(RecentRunsPage.productName);
		jsExecutorClickUsingLocator(RecentRunsPage.productName);
		jsExecutorClickUsingLocator(RecentRunsPage.productName);

		waitforElement(RecentRunsPage.firstProduct);
		jsExecutorClickUsingLocator(RecentRunsPage.firstProduct);
	}
}
