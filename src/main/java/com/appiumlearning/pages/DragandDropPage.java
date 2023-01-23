package com.appiumlearning.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.appiumlearning.drivers.DriverManager;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class DragandDropPage extends BasePage {
	
	@AndroidFindBy(id="io.appium.android.apis:id/drag_dot_1")
	private WebElement sourceElement;
	
	@AndroidFindBy(id="io.appium.android.apis:id/drag_dot_2")
	private WebElement targetElement;
	
	@AndroidFindBy(id="io.appium.android.apis:id/drag_result_text")
	private WebElement resultText;
	
	public DragandDropPage() {
		//Page Factory Initialization
		PageFactory.initElements(new AppiumFieldDecorator(DriverManager.getDriver()), this);
	}
	
	public void performDragAndDrop() {
		dragAndDrop(sourceElement, targetElement);

	}
	
	public String getSuccessMessage() {
		return resultText.getText();
	}
	
	

}
