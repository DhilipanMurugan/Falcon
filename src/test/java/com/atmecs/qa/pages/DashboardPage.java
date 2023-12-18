package com.atmecs.qa.pages;

public class DashboardPage {

	public static String expectedTitle       = "Falcon Test Reports";	
	public static String locatorsFilePath    = "C:\\Users\\dhilipan.murugan\\eclipse-workspace\\Falcon_Test\\src\\test\\resources\\locators.properties";
	public static String maximizeKey 		 = "//div[@class='nav-wrapper']/ul/li/a/em[@class='fa fa-expand']";
	public static String refreshButton       = "//em[@class='icon-refresh ng-scope']";
	
	
	public static String projectsList        = "//a[@class='list-group-item']";
	public static String barcodeBar		     = "(//div[@class='text-center ng-isolate-scope'])[1]";	
	public static String barcodeHover        = "(//td[@class='wd-xs hidden-xs hidden-sm'])[1]";
	public static String lastRunTitle        ="(//p[@class='m0'])[1]";
	public static String downloadButton      ="//span[@role='button']";
	
	
	public static String lastRunStatus       = "(//small[@class='text-muted ng-binding'])[1]";
	public static String totalTestcaseICon   = "(//em[@class=\'icon-doc mr fa-lg\'])[1]";
	public static String totalTestcaseCount  ="//p[@class= 'm0 text-muted ng-binding'][1]";
	public static String hoverTotalTestcases ="//div[@class= 'tooltip ng-isolate-scope fade top in']";
	
	
	public static String passedFailBar       ="//div[@class='progress-bar ng-scope ng-isolate-scope progress-bar-danger'][1]";
	public static String passedRateColour    ="(//div[@class= 'progress-bar ng-scope ng-isolate-scope progress-bar-success'])[3]";
	public static String failedRateColour    ="(//div[@class= 'progress-bar ng-scope ng-isolate-scope progress-bar-danger'])[3]";
	public static String snapShotButton		 ="(//table[@class='wd-wide']/tbody/tr/td[@class='wd-sm'])[2]//button[@type='button']";
	public static String viewSnapShotPopup   ="//a[normalize-space(text())='View Product Snapshot']";

}
