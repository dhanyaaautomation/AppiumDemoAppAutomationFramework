package com.appiumlearning.drivers;

import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;

import com.appiumlearning.enums.Modes;

public class DriverFactory {
	
	private DriverFactory() {
		
	}
	
	public static WebDriver driver = null;
	
	public static WebDriver get(Modes mode) throws MalformedURLException {
		if(mode.equals(Modes.LOCAL)) {
			driver = new LocalDriverImpl().getDriver();
		}
		return driver;

	}

}
