package com.appiumlearning.testcases;

import java.lang.reflect.Method;
import java.net.MalformedURLException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.appiumlearning.drivers.Driver;
import com.appiumlearning.drivers.DriverManager;
import com.appiumlearning.reports.ExtentReport;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

public class BaseTest {
	
	/*
	 1. Never Hardcode
	 2. Try to reuse the code but inheritence is the last option
	 3. Make it easy for others to follow or write new tests
	 4. Clean Code
	 5. Keep right things at right place
	 */
	
	@BeforeMethod
	public void setUp() throws MalformedURLException {	
		Driver.initDriver();
	}
	
	@AfterMethod
	public void tearDown() {
		
		Driver.quitDriver();
	}
	

}
