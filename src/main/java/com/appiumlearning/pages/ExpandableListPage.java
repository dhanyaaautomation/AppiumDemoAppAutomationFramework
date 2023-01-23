package com.appiumlearning.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.appiumlearning.drivers.DriverManager;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class ExpandableListPage extends BasePage {
	
	public ExpandableListPage() {
		PageFactory.initElements(new AppiumFieldDecorator(DriverManager.getDriver()), this);
	}
	
	@AndroidFindBy(accessibility="1. Custom Adapter")
	private WebElement custom_adaptor;
	
	@AndroidFindBy(xpath ="//android.widget.TextView[@text='People Names']")
	private WebElement people_names;
	
	public void clickCutomAdaptor() {
		click(custom_adaptor, "Custom Adaptor");
	}
	
	public void clickPeopleNames() {
		click(people_names, "People Names");
	}
	

}
