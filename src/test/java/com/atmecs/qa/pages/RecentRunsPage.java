package com.atmecs.qa.pages;

public class RecentRunsPage {

	public static String recentRunsTab  	="//span[text()='Recent Runs']";
	public static String recentRunsTitle    ="//h3[normalize-space(text()='Recent Runs')][@style='padding-bottom: 11px;']";
	public static String productName    	="//div[@class='ng-table-header ng-scope']/child::span[text()='Product Name']";
	public static String component      	="//div[@class='ng-table-header ng-scope']/child::span[text()='Component']";
	public static String testCases      	="//span[text()='Testcases #']";
	
	public static String passRate      	 	="//span[text()='Pass %']";
	public static String lastRun        	="//span[text()='Last Run']";
	public static String firstProduct       ="//td[@data-title-text='Product Name']";
	public static String firstComponent     ="//td[@data-title-text='Component']";
	public static String firstTestcase      ="//td[@data-title-text='Testcases #']";
	
	public static String firstPassPercent   ="//td[@data-title-text='Pass %']";
	public static String firstLastRun       ="//td[@data-title-text='Last Run']";
	public static String deleteButton       ="//button[@class='m-0 md-button md-ink-ripple']";
	
	
	
	//a[@title='Recent Runs']/parent::li[@role='button']
	////span[text()='Recent Runs']//parent::a[@title='Recent Runs']
	//span[text()='Recent Runs']
	//div[@class='ng-table-header ng-scope']/child::span[text()='Product Name']
}
