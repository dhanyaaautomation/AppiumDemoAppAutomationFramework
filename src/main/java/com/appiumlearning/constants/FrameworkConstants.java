package com.appiumlearning.constants;

public final class FrameworkConstants {
	
	private FrameworkConstants() {
		
	}
	
	private static final String APK_FILE_PATH = System.getProperty("user.dir")+"/src/test/resources/apkfiles/ApiDemos-debug.apk";
    private static final String CONFIG_FILE_PATH = System.getProperty("user.dir")+"/src/test/resources/config/config.properties";
	
	public static String getConfigFilePath() {
		return CONFIG_FILE_PATH;
	}

	public static String getApkFilePath() {
		return APK_FILE_PATH; 
	}

}
