package com.ui.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.testng.Assert.*;

import java.util.logging.LogManager;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static com.constants.Browser.*;

import com.ui.pages.HomePage;
import com.ui.pages.LoginPage;
import com.ui.pojo.User;
import com.utility.BrowserUtility;
import com.utility.LoggerUtility;

public class LoginTest extends BaseTest{

	

//	@Test(description = "Verify login with valid credentials", groups = { "e2e", "sanity" }, dataProviderClass =com.ui.dataproviders.loginDataProvider.class, dataProvider = "LoginTestDataProvider" )
//	public void loginTest(User user) {
//		// HomePage homepage = new HomePage(Browser.EDGE); // static import is not
//		// required
//
//		// static import -- just code readability
//
//		assertEquals(homepage.goToLoginPage().doLoginWIth(user.getEmail(), user.getPassword()).getUsername(),
//				"Viji gowda");
//
//	}
	
//	@Test(description = "Verify login with valid credentials", groups = { "e2e", "sanity" }, dataProviderClass =com.ui.dataproviders.loginDataProvider.class, dataProvider = "LoginTestCSVDataProvider"
//			
//			, retryAnalyzer =  com.ui.listeners.MyRetryListener.class)
//	public void loginCsvTest(User user) {
//		// HomePage homepage = new HomePage(Browser.EDGE); // static import is not
//		// required
//
//		// static import -- just code readability
//		
//		assertEquals(homepage.goToLoginPage().doLoginWIth(user.getEmail(), user.getPassword()).getUsername(),
//				"Viji gowda");
//
//	}
//	
@Test(description = "Verify login with valid credentials", groups = { "e2e", "sanity" }, dataProviderClass =com.ui.dataproviders.loginDataProvider.class, dataProvider = "LoginTestCSVDataProvider"
			
			, retryAnalyzer =  com.ui.listeners.MyRetryListener.class)
	public void loginCsvTest1(User user) {
		// HomePage homepage = new HomePage(Browser.EDGE); // static import is not
		// required

		// static import -- just code readability
		
		assertEquals(homepage.goToLoginPage().doLoginWIth(user.getEmail(), user.getPassword()).getUsername(),
				"Viji gowda");

	}


}
