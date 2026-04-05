package com.ui.dataproviders;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.testng.annotations.DataProvider;

import com.google.gson.Gson;
import com.ui.pojo.TestData;
import com.ui.pojo.User;
import com.utility.CsvReaderUility;

public class loginDataProvider {

	
	@DataProvider(name = "LoginTestDataProvider")
	public Iterator<Object> loginData() throws FileNotFoundException {
	Gson gson = new Gson();
	
	File testDataFIle = new File(System.getProperty("user.dir")+"\\testData\\loginData.json");
	System.out.println(testDataFIle);
	FileReader filereader = new FileReader(testDataFIle);
	TestData data = gson.fromJson(filereader, TestData.class);
  ArrayList<Object> dataToReturn = new ArrayList<Object>();
  
  for(User user :data.getData())
  {
	  dataToReturn.add(new Object[] {user});
  }
	return dataToReturn.iterator();
	}
	
	
	@DataProvider(name = "LoginTestCSVDataProvider")
	public Iterator<User> loginCsvDataProvider() {
		return CsvReaderUility.CsvFileReader("testData");
	}
}
