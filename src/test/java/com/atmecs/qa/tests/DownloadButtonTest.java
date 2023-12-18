package com.atmecs.qa.tests;

import org.testng.annotations.Test;
import com.atmecs.qa.pages.DashboardPage;
import com.atmecs.qa.pages.DashboardProjectFilterPage;
import com.atmecs.qa.utils.ActionUtils;

public class DownloadButtonTest extends ActionUtils{
	
	@Test(priority = 1)
	public void webServices() {

		clickOnElement(DashboardProjectFilterPage.webProject);
	}
	
	@Test(priority = 2)
	public void projectresultsDownload() {
		
		clickOnElement(DashboardPage.downloadButton);	
	}
}
