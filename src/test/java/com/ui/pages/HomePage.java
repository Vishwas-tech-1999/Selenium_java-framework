package com.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.constants.Browser;
import com.constants.Env;
import com.utility.BrowserUtility;
import com.utility.JsonUtility;
import com.utility.PropertiesUtil;

public final class  HomePage extends BrowserUtility {
	


	private static final By SIGN_IN_LINK_LOCATOR = By.xpath("//a[contains(text(),'Sign in')]");
	
	
	public HomePage(Browser browsername, boolean isheadless) {
		super(browsername, isheadless); // call parent class constructor ins child class construcor
		//goToWebsite(PropertiesUtil.readProperty(Env.QA, "Url"));
		goToWebsite(JsonUtility.readJson(Env.QA));

		
	}
	
	public HomePage(String browsername, boolean isheadless) {
		super(browsername, isheadless); // call parent class constructor ins child class construcor
		//goToWebsite(PropertiesUtil.readProperty(Env.QA, "Url"));
		goToWebsite(JsonUtility.readJson(Env.QA));

		
	}
	
	public LoginPage goToLoginPage() {
		clickOn(SIGN_IN_LINK_LOCATOR);
		LoginPage loginpage = new LoginPage(getDriver()); // goToLoginPage methos is taking user to login page so login page class object is crated and passing the driver
		return loginpage;
	}
	
	
}
