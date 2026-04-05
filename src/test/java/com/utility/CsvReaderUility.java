package com.utility;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;
import com.ui.pojo.User;

public class CsvReaderUility {

	public static Iterator<User> CsvFileReader(String filename) {
		// TODO Auto-generated method stub

		File file = new File(System.getProperty("user.dir") + "\\testData\\"+filename+".csv");
		FileReader fileReader = null;
		CSVReader csvReader;
		String[] line = null;
		List<User> userData = null;
		try {

			fileReader = new FileReader(file);
			csvReader = new CSVReader(fileReader);
			csvReader.readNext(); // skip column
			
			userData = new ArrayList<User>();
			User user;
		while((line = csvReader.readNext()) != null)
		{
			user = new User(line[0], line[1]);
			userData.add(user);
		}
		} catch (IOException | CsvValidationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		for( User user : userData)
		{
			System.out.println(user);
		}
		
		return userData.iterator();

	}
}
