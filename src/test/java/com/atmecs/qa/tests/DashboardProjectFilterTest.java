package com.atmecs.qa.tests;

import org.testng.annotations.Test;

import com.atmecs.qa.pages.DashboardProjectFilterPage;
import com.atmecs.qa.utils.ActionUtils;

public class DashboardProjectFilterTest extends ActionUtils {

	@Test
	public void webServices() {
		
		clickOnElement(DashboardProjectFilterPage.webProject);	
		elementDisplay(DashboardProjectFilterPage.dashboardToggle);
		clickOnElement(DashboardProjectFilterPage.dashboardToggle);
	
	
		clickOnElement(DashboardProjectFilterPage.selectCustomer);
		clickOnElement(DashboardProjectFilterPage.selectFalcon);

		clickOnElement(DashboardProjectFilterPage.selectModule);
		clickOnElement(DashboardProjectFilterPage.selectHeatclinic);		

		clickOnElement(DashboardProjectFilterPage.selectOS);
		clickOnElement(DashboardProjectFilterPage.selectWin_10);
		
		clickOnElement(DashboardProjectFilterPage.selectBrowser);
		clickOnElement(DashboardProjectFilterPage.selectChrome);

		clickOnElement(DashboardProjectFilterPage.selectStatus);
		clickOnElement(DashboardProjectFilterPage.selectPass);

		clickOnElement(DashboardProjectFilterPage.selectStatus);
		clickOnElement(DashboardProjectFilterPage.selectFail);

		clickOnElement(DashboardProjectFilterPage.selectStatus);
		clickOnElement(DashboardProjectFilterPage.selectSkip);

	}
}
