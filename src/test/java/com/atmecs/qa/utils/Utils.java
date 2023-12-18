package com.atmecs.qa.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import com.atmecs.qa.constants.Constants;

public class Utils {
	
	public static String readLocators(String locators) {
		return (String) readProperties().getProperty(locators);

	}

	public static Properties readProperties() {
		Properties properties = new Properties();
		try {
			properties.load(new FileInputStream(Constants.configPath));
		} catch (IOException exception) {
			System.out.println("File is Not Found" + exception);
		}
		return properties;
	}
}
