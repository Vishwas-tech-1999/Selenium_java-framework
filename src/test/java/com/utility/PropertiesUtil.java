package com.utility;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import com.constants.Env;

public class PropertiesUtil {

	public static String readProperty(Env env, String url)  {
		
		//steps to read properties file
		// first point the file
		//load the file
		//then retreive the value from the file
		
		System.out.println(System.getProperty("user.dir"));
		File propfile =  new File(System.getProperty("user.dir")+"\\config\\"+env+".properties");
		FileReader filereader;
		Properties proprties = null;
		try {
			filereader = new FileReader(propfile);
			 proprties = new Properties();
			proprties.load(filereader);
		} catch (IOException e) {
			
		}
		
		
		
		String Url = proprties.getProperty(url.toUpperCase());
		System.out.println(Url);
		
		return Url;

	}

}
