package com.atmecs.qa.pages;

public class CheckingPassFailTcPage {

	public static String webProject       ="//h4[normalize-space(text())='FalconWebDemo']";
	public static String dashboardToggle  ="//small[normalize-space(text())='Dashboard']";
	public static String selectStatus     ="//select[@name='status']";
	public static String selectPass       ="//option[text()='Pass']";
	
	public static String selectFail 	  ="//option[text()='Fail']";
	public static String loginTestStep    ="//td[contains(text(),'loginTest')]";
	public static String errorSlide       ="//span[text()='Error']//parent::md-tab-item";
	public static String erroredText      ="//md-content[@class='md-padding ng-binding ng-scope']"; 
	
	public static String invalidLoginStep ="//td[contains(text(),'invalidLoginTest')]";
	public static String failScreenshot   ="//em[@class='fa fa-camera icon-danger ng-scope']";
	public static String failScreenshotbt ="//button[@class='close']";
	//public static String
	
}
