package com.appiumlearning.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.appiumlearning.drivers.DriverManager;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class HomePage extends BasePage {
	
	//Page Factory
	//By Locators
	//String Locators
	
	//private final By Views = AppiumBy.accessibilityId("views"); 

	@AndroidFindBy(accessibility="Views")
	private WebElement views; 
	
	@AndroidFindBy(accessibility="Preference")
	private WebElement preference; 
	
	@AndroidFindBy(accessibility="OS")
	private WebElement os; 
	
	public HomePage() {
		//Page Factory Initialization
		PageFactory.initElements(new AppiumFieldDecorator(DriverManager.getDriver()), this);
	}
	
	public ViewsLandingPage clickOnViews() {
		click(views,"Views");
		return new ViewsLandingPage();
	}
	
	public PreferenceLandingPage clickOnPreference() {
		//preference.click();
		tapByCoordinates(115, 1503);
		return new PreferenceLandingPage();
	}
	
	public void clickonOS() {
		os.click();
	}
	

}
