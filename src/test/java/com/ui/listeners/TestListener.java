package com.ui.listeners;

import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class TestListener implements ITestListener  {
	ExtentSparkReporter extentSparkReporter;
	ExtentReports extentReporter;
	ExtentTest extentTest;
	
	public  void onTestStart(ITestResult result) {
		extentSparkReporter = new ExtentSparkReporter(System.getProperty("user.dir")+"//report.html");
		extentReporter = new ExtentReports();
		extentReporter.attachReporter(extentSparkReporter);
		
	}
	

}
