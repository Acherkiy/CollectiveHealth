package com.qa.cohealth1.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class OpenPositionsPage extends Base {

	WebDriver webdriver;

	public OpenPositionsPage(WebDriver _driver) {
		super(_driver);
		webdriver = _driver;
	}

	@FindBy(how = How.XPATH, xpath = "//div[@id='engineering']//a[@href='/jobs/apply/885445']/h2[.='QA Engineer (Web Applications)']")
	private WebElement qaEngineer;

	public void goToQaEngineer() {
		qaEngineer.click();

	}

}
