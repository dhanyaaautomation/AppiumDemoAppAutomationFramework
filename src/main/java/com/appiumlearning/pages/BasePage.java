package com.appiumlearning.pages;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.appiumlearning.drivers.DriverManager;
import com.appiumlearning.reports.ExtentLogger;
import com.appiumlearning.reports.ExtentManager;
import com.appiumlearning.reports.ExtentReport;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidTouchAction;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;

public class BasePage {

	protected void click(WebElement element, String elementname) {
		explicitWait(element);
		element.click();
		//System.out.println(elementname + " is clicked successfully");
		ExtentLogger.pass(elementname + " is clicked successfully");
	}

	protected void click(By by, String elementname) {
		click(DriverManager.getDriver().findElement(by), elementname);

	}

	protected void click(String locatortype, String value, String elementname) {
		if(locatortype.equalsIgnoreCase("xpath")) {
			click(By.xpath(value),elementname);

		}
		else if(locatortype.equalsIgnoreCase("id")) {
			click(By.id(value),elementname);
		}
		else if(locatortype.equalsIgnoreCase("accessibilityId")) {
			click(AppiumBy.accessibilityId(value),elementname);
		}
	}

	protected void tap(WebElement elementname) {

		TouchAction ta = new AndroidTouchAction((PerformsTouchActions) DriverManager.getDriver())
				.tap(TapOptions.tapOptions().withElement(ElementOption.element(elementname)))
				.perform();
	}

	protected void tapByCoordinates(int x, int y) {

		new AndroidTouchAction((PerformsTouchActions) DriverManager.getDriver()).tap(PointOption.point(x,y)).perform();

	}

	protected void longPress(WebElement element) {
		new AndroidTouchAction((PerformsTouchActions) DriverManager.getDriver())
		.longPress(LongPressOptions.longPressOptions().withElement(ElementOption.element(element)))
		.waitAction(WaitOptions.waitOptions(Duration.ofSeconds(7)))
		.perform();

		//Uninterruptibles.sleepUninterruptibly(3,TimeUnit.SECONDS);
	}

	protected void swipe(WebElement source, WebElement target) {
		new AndroidTouchAction((PerformsTouchActions) DriverManager.getDriver())
		.longPress(LongPressOptions.longPressOptions().withElement(ElementOption.element(source)))
		.moveTo(ElementOption.element(target))
		.release()
		.perform();
	}


	protected void dragAndDrop(WebElement source, WebElement target) {
		new AndroidTouchAction((PerformsTouchActions) DriverManager.getDriver())
		.longPress(LongPressOptions.longPressOptions().withElement(ElementOption.element(source)))
		.waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2)))
		.moveTo(ElementOption.element(target))
		.release()
		.perform();
		//System.out.println("Drag and Drop is Successfull");
		ExtentLogger.pass("Drag and Drop is successfully done");
	}


	protected void scrollToSpecifyElementandClick(By by,AndroidDriver driver) {

		while(driver.findElements(by).isEmpty()) {
			Dimension dimensions = driver.manage().window().getSize();
			Double screenHeightStart = dimensions.getHeight() * 0.5;
			int scrollStart = screenHeightStart.intValue();
			Double screenHeightEnd = dimensions.getHeight() * 0.2;
			int scrollENd = screenHeightEnd.intValue();
			int center = (int) (dimensions.width *0.5);

			new AndroidTouchAction(driver)
			.press(PointOption.point(center, scrollStart))
			.waitAction(WaitOptions.waitOptions(Duration.ofMillis(500)))
			.moveTo(PointOption.point(center, scrollENd))
			.release()
			.perform();

		}

		if(!driver.findElements(by).isEmpty()) {
			driver.findElement(by).click();
		}

	}

	protected void explicitWait(WebElement element) {
		new WebDriverWait(DriverManager.getDriver(),Duration.ofSeconds(1) )
		.withMessage("")
		.pollingEvery(Duration.ofSeconds(1))
		.until(ExpectedConditions.visibilityOf(element));

	}

}
