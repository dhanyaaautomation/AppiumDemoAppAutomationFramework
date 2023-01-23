package com.appiumlearning.drivers;

import java.net.MalformedURLException;
import java.util.Objects;

import org.openqa.selenium.WebDriver;

import com.appiumlearning.enums.Modes;
import com.appiumlearning.utils.PropertyUtils;
import static com.appiumlearning.drivers.DriverManager.*;

public final class Driver {
	

	private Driver() {
		//Create Private constructor so that no one can create objects for the class
	}
	
	public static void initDriver() throws MalformedURLException {
		if(Objects.isNull(getDriver()))
		{
		String modevalue = PropertyUtils.getValue("mode");
		WebDriver driver = DriverFactory.get(Modes.valueOf(modevalue.toUpperCase()));
		DriverManager.setDriver(driver);
		}
		
	}
	
	public static void quitDriver() {
		if(Objects.nonNull(getDriver())) {
			getDriver().quit();
			//Close the driver and remove the threads
		    unLoad();
		}
		
	}

}
