package com.utility;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import com.constants.Env;
import com.google.gson.Gson;
import com.ui.pojo.Config;
import com.ui.pojo.Environment;

public class JsonUtility {

	public static String readJson(Env env)  {
	
		File file = new File(System.getProperty("user.dir")+"\\config\\env.json");
		FileReader filereader;
		Config config = null;
		try {
			filereader = new FileReader(file);
			Gson gson = new Gson();
			 config = gson.fromJson(filereader, Config.class);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Environment environment = config.getEnvironments().get("QA");
		System.out.println(environment.getURL());
		return environment.getURL();
	}

}
