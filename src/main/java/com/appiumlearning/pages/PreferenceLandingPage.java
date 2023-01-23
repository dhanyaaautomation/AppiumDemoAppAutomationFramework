package com.appiumlearning.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.appiumlearning.drivers.DriverManager;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public final class PreferenceLandingPage extends BasePage {
	
	@AndroidFindBy(accessibility="1. Preferences from XML")
	private WebElement preferenceFromXML;
	
	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ListView/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.CheckBox")
	private WebElement checkboxPreference;
	
	public PreferenceLandingPage() {
		//Page Factory Initialization
		PageFactory.initElements(new AppiumFieldDecorator(DriverManager.getDriver()), this);
	}
	
	public WebElement selectCheckboxPreference() {
		click(preferenceFromXML, "Preference From XML");
		click(checkboxPreference,"Check Box Preference");
		return checkboxPreference;
	}


	
	

}
