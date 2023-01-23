package com.appiumlearning.drivers;

import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;

public interface IDriver {
	
	//interface gives you skeleton.
	public WebDriver getDriver() throws MalformedURLException;

}
