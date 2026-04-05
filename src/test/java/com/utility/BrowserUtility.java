package com.utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

import com.constants.Browser;

public abstract class BrowserUtility {
	
	private WebDriver driver;
	
	
	
	public WebDriver getDriver() {
		return driver;
	}

	public   BrowserUtility(WebDriver driver) {
		super();
		this.driver = driver; // initialize the instance variable
	}
	
	public BrowserUtility(String browserName) {
		if(browserName.equalsIgnoreCase("chrome")){
			this.driver = new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("edge")){
			this.driver = new EdgeDriver();
		}
		else {
			System.err.println("Invlid browser.. pass the valid browser name");
		}
	}
	
	
	public BrowserUtility(Browser browserName) {
		if(browserName == Browser.CHROME){ 
			this.driver = new ChromeDriver();
		}
		else if(browserName == Browser.EDGE){
			this.driver = new EdgeDriver();
		}
		
	}
	
	public BrowserUtility(Browser browserName, boolean isHeadless) {
		if(browserName == Browser.CHROME){ 
			if(isHeadless) {
			ChromeOptions chromeOptions = new ChromeOptions();
			chromeOptions.addArguments("--headless=old");
			chromeOptions.addArguments("--window-size=1920,1080");

			}
			else {
				this.driver = new ChromeDriver();
			}
		}
		else if(browserName == Browser.EDGE){
			this.driver = new EdgeDriver();
		}
		
	}
	
	public BrowserUtility(String browserName, boolean isHeadless) {
		if(browserName.equalsIgnoreCase("Chrome")){ 
			if(isHeadless) {
			ChromeOptions chromeOptions = new ChromeOptions();
			chromeOptions.addArguments("--headless=old");
			chromeOptions.addArguments("--window-size=1920,1080");

			}
			else {
				this.driver = new ChromeDriver();
			}
		}
		else if(browserName.equalsIgnoreCase("edge")){
			this.driver = new EdgeDriver();
		}
		
	}

	
	
	public void goToWebsite(String url)
	{
		driver.get(url);
	}

	public void maximizeWindow() {
		driver.manage().window().maximize();
	}
	
	public void clickOn(By locator) {
		WebElement element = driver.findElement(locator);
		element.click();
		
	}
	
	public void enterText(By locator, String enterToText) {
		WebElement element = driver.findElement(locator);
		element.sendKeys(enterToText);
	}
	
	public String getVisibleText(By locator) {
		WebElement element = driver.findElement(locator);
	return	element.getText();
	}
	
	
}
