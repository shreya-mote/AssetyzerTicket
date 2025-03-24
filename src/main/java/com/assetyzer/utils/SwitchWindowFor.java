package com.assetyzer.utils;

import java.util.Set;

import com.assetyzer.base.Keyword;

public class SwitchWindowFor {
	public static void switchingWindow(String url) {
		Set<String > multiple_WindowHandle=	Keyword.driver.getWindowHandles();
		for (String multipleWindow : multiple_WindowHandle) {
			Keyword.driver.switchTo().window(multipleWindow);
			 String currentWindow_url =Keyword.driver.getCurrentUrl();
			if(currentWindow_url.contains(url)) {
				break;
			}else {
				continue;
			}
		
		}
	}

}
