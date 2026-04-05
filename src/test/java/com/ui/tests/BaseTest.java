package com.ui.tests;

import static com.constants.Browser.CHROME;

import java.util.logging.LogManager;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import com.ui.pages.HomePage;
import com.utility.BrowserUtility;
import com.utility.LoggerUtility;

public class BaseTest {

	protected HomePage homepage;
	private boolean isheadless = false;
	LogManager logger = LoggerUtility.getLogger(this.getClass());

	@Parameters({ "browser", "isheadless" })
	@BeforeMethod(description = "Load the home page of the website")
	public void setup(
			
			@Optional("Chrome") String browser,
			@Optional("false") boolean isheadless) {
		homepage = new HomePage(browser, isheadless);
	}

	public BrowserUtility getInstance() {
		return homepage;
	}

}
