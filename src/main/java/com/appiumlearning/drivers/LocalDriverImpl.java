package com.appiumlearning.drivers;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.appiumlearning.constants.FrameworkConstants;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class LocalDriverImpl implements IDriver {

	public WebDriver getDriver() throws MalformedURLException {
		
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability(MobileCapabilityType.APP,FrameworkConstants.getApkFilePath());
		//capabilities.setCapability(AndroidMobileCapabilityType.SYSTEM_PORT,"8200");
		capabilities.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "io.appium.android.apis");
		capabilities.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "io.appium.android.apis.ApiDemos");
		capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2"); 
		capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android"); 
		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Redmi"); 
	
		return new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
	}

}
