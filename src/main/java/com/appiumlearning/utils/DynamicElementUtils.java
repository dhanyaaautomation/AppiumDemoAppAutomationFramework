package com.appiumlearning.utils;

public final class DynamicElementUtils {
	
	private DynamicElementUtils() {}
	
	public static String getAccessibilityID(String replaceble, String value) {
		return String.format(replaceble, value);
		
	}

}
