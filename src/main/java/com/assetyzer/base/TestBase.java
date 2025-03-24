package com.assetyzer.base;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.assetyzer.utils.PropertiesFile;

public class TestBase {
	@BeforeMethod
	public void setup() {
		Keyword.openBrowser(PropertiesFile.getBrowser());
		System.out.println("browser opened");
		Keyword.launchUrl(PropertiesFile.getUrl("qa"));
		System.out.println("url opened");
	}
	/*@AfterMethod
	public void tearDown() {
		Keyword.driver.quit();
	}*/

}
