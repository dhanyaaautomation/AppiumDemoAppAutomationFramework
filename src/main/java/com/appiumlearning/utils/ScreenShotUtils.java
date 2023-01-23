package com.appiumlearning.utils;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.appiumlearning.drivers.DriverManager;

public final class ScreenShotUtils {
	
	private ScreenShotUtils() {
		
	}
	
	public static String getBase64Image() {
		String screenshot = ((TakesScreenshot) DriverManager.getDriver()).getScreenshotAs(OutputType.BASE64);
		return screenshot;

		
	}
	


}
