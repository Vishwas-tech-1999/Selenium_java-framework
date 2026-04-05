//package com.ui.tests;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import static org.testng.Assert.*;
//import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.Test;
//
//import static com.constants.Browser.*;
//
//import com.ui.pages.HomePage;
//import com.ui.pages.LoginPage;
//import com.utility.BrowserUtility;
//
//public class LoginTest3 {
//
//	HomePage homepage;
//
//	@BeforeMethod(description = "Load the home page of the website")
//	public void setup() {
//		homepage = new HomePage(CHROME);
//	}
//
//	@Test(description = "Verify login with valid credentials", groups = { "e2e", "sanity" })
//	public void loginTest() {
//		// HomePage homepage = new HomePage(Browser.EDGE); // static import is not
//		// required
//
//		// static import -- just code readability
//
//		assertEquals(homepage.goToLoginPage().doLoginWIth("9f6a9gtufw@bltiwd.com", "password").getUsername(),
//				"Viji gowda");
//
//	}
//
//}
