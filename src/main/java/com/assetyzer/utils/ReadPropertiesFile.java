package com.assetyzer.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertiesFile {
	public static String ReadProperTiesFileData(String filepath,String key) {
		FileInputStream fis=null;
		  try {
			fis=new FileInputStream(filepath);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	   Properties prop=new Properties();
		try {
			prop.load(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String value=prop.getProperty(key);
		return value;
		
	}
}
