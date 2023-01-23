package com.appiumlearning.constants;

import lombok.Getter;

public class FrameworkConstantswithLombok {
	
	//Lombok can automatically generate getters
	 private static @Getter final String APK_FILE_PATH = System.getProperty("user.dir")+"/src/test/resources/apkfiles/ApiDemos-debug.apk";
	 private static @Getter final String CONFIG_FILE_PATH = System.getProperty("user.dir")+"/src/test/resources/config/config.properties";

	
}
