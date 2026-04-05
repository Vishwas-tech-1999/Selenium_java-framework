package com.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.utility.BrowserUtility;

public final class LoginPage extends BrowserUtility {

	private static final By EMAIL_TEXT_BOX_LOCATOR = By.xpath("//input[@id='email']");
	private static final By PASSWORD_TEXT_BOX_LOCATOR = By.xpath("//input[@id='passwd']");
	private static final By SUBMIT_BUTON_LOCATOR = By.xpath("//button[@id='SubmitLogin']");

	public LoginPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	
	public MyAccountPage doLoginWIth(String Un, String pwd) {
	enterText(EMAIL_TEXT_BOX_LOCATOR, Un);
	enterText(PASSWORD_TEXT_BOX_LOCATOR, pwd);
	clickOn(SUBMIT_BUTON_LOCATOR);
	MyAccountPage myaccountpage = new MyAccountPage(getDriver());
	return myaccountpage;

	}
}
