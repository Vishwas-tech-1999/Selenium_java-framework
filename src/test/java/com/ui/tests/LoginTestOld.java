//package com.ui.tests;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import com.ui.pages.HomePage;
//import com.utility.BrowserUtility;
//
//public class LoginTestOld {
//	public static void main(String[] args) {
//
//		WebDriver driver = new ChromeDriver();
//
//		HomePage homepage = new  HomePage(driver);
//		homepage.goToLoginPage();
//		
//		browserUtility.goToWebsite("https://automationpractice.techwithjatin.com/");
//
//		browserUtility.maximizeWindow();
//
//		By SignInLinkLocator = By.xpath("//a[contains(text(),'Sign in')]");
//		browserUtility.clickOn(SignInLinkLocator);
//
//		By emailTextBoxLocator = By.xpath("//input[@id='email']");
//		browserUtility.enterText(emailTextBoxLocator, "9f6a9gtufw@bltiwd.com");
//
//		By passwordTextBoxLocator = By.xpath("//input[@id='passwd']");
//		browserUtility.enterText(passwordTextBoxLocator, "password");
//
//		By signInButtonLocator = By.xpath("//button[@id='SubmitLogin']");
//		browserUtility.clickOn(signInButtonLocator);
//	}
//
//}
