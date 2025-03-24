package com.assetyzer.utils;

public class PropertiesFile {
	static String filepath=System.getProperty("user.dir")+"/src/test/resources/Config/app.properties";
	
	public static String getBrowser() {
		return ReadPropertiesFile.ReadProperTiesFileData(filepath, "browser_name");
	}
	public static String getUrl(String env) {
		return ReadPropertiesFile.ReadProperTiesFileData(filepath, env + "_app_url");
	}
	
}
