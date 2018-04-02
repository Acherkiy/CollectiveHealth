package com.qa.cohealth1.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class JobsPage extends Base {

	WebDriver webdriver;

	public JobsPage(WebDriver _driver) {
		super(_driver);

		webdriver = _driver;
	}

	@FindBy(how = How.CSS, css = ".jobs-hero-cta")
	private WebElement viewOpenPositions;

	public OpenPositionsPage viewOpenPosition() {
		viewOpenPositions.click();
		return new OpenPositionsPage(webdriver);

	}

}
