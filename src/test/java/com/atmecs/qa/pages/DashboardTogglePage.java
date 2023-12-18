package com.atmecs.qa.pages;

public class DashboardTogglePage {

	public static String webProject       ="//h4[normalize-space(text())='FalconWebDemo']";
	public static String dashboardToggle  ="//small[normalize-space(text())='Dashboard']";
	public static String environment      ="//li[@class='list-group-item']/child::span[text()='Environment']";
	public static String testPhase        ="//span[normalize-space(text())='Test Phase']";
	public static String startTime        ="//span[normalize-space(text())='Start Time']";
	
	public static String endTime          ="//span[normalize-space(text())='End Time']";
	public static String totalTests       ="//div[@class='row row-table row-flush']//child::div[@class='col-xs-4 bg-purple text-center']";
	public static String totalTestsIcon   ="//div[@class='col-xs-4 bg-purple text-center']";
	public static String passTests        ="//div[@class='row row-table row-flush']//child::div[@class='col-xs-4 bg-green text-center']";
	public static String passTestsIcon    ="//div[@class='col-xs-4 bg-green text-center']";
	
	public static String failTests        ="//div[@class='row row-table row-flush']//child::div[@class='col-xs-4 bg-danger text-center']";
	public static String failTestsIcon    ="//div[@class='col-xs-4 bg-danger text-center']";
	public static String skipTests        ="//div[@class='row row-table row-flush']//child::div[@class='col-xs-4 bg-info text-center']";
	public static String skipTestsIcon    ="//div[@class='col-xs-4 bg-info text-center']";
	
	

	
}
