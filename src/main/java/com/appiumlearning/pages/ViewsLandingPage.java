package com.appiumlearning.pages;

import org.openqa.selenium.By;

import com.appiumlearning.drivers.DriverManager;
import com.appiumlearning.utils.DynamicElementUtils;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.pagefactory.AndroidBy;

public class ViewsLandingPage extends BasePage {
	
	public ViewsLandingPage() {
    //Empty Constructor
 }
	
	//Using By Locator to find elements
	/*
	 private By dragAndDrop = AppiumBy.accessibilityId("Drag and Drop");
	
	public void clickDragAndDrop() {
	  DriverManager.getDriver().findElement((By)dragAndDrop).click();
	}
	*/
	
	//Using String Locators to find elements
	private String accessbilityId = "%s";
	
	public void clickMenuItem(String menuname) {
		String newaccessbilityId = DynamicElementUtils.getAccessibilityID(accessbilityId, menuname);
		//DriverManager.getDriver().findElement(AppiumBy.accessibilityId(newaccessbilityId)).click();
		click("accessibilityId", newaccessbilityId, menuname);
	}
	
	

}
