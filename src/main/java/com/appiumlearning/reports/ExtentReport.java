package com.appiumlearning.reports;

import java.util.Objects;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;


public class ExtentReport {
	
	private ExtentReport() {}
	
	public static ExtentReports extent;
	
	public static void initReports() {
		if(Objects.isNull(ExtentManager.getExtentTest())) {
		extent = new ExtentReports();
		ExtentSparkReporter sprak = new ExtentSparkReporter(System.getProperty("user.dir")+"/index.html");
		
		sprak.config().setTheme(Theme.DARK);
		sprak.config().setReportName("AutomationReport");
		sprak.config().setDocumentTitle("AutomationReport");
		extent.attachReporter(sprak);
		}
	}
	
	public static void tearDownReports() {
		if(Objects.nonNull(ExtentManager.getExtentTest())) {
		//Flush method will write all the logs to the report
		extent.flush();
		ExtentManager.unLoad();
		}
	}
	
	public static void createTest(String testcasename){
		ExtentTest test = extent.createTest(testcasename);
		ExtentManager.setExtentTest(test);
		
	}
}
