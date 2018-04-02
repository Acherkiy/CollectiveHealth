package com.qa.cohealth1.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PartnerShipsPage extends Base {

	WebDriver webdriver;

	public PartnerShipsPage(WebDriver _driver) {
		super(_driver);
		webdriver = _driver;

	}

	@FindBy(how = How.CSS, css = "input[id='firstname-22bcb32e-5685-4c31-9e50-2726029ceb23']")
	private WebElement firstName;

	@FindBy(how = How.CSS, css = "input[id='lastname-22bcb32e-5685-4c31-9e50-2726029ceb23']")
	private WebElement lastName;

	@FindBy(how = How.CSS, css = "input[id='email-22bcb32e-5685-4c31-9e50-2726029ceb23']")
	private WebElement email;

	@FindBy(how = How.CSS, css = "input[id='company-22bcb32e-5685-4c31-9e50-2726029ceb23']")
	private WebElement companyName;

	@FindBy(how = How.CSS, css = ".actions .primary-button")
	private WebElement getInTouch;

	public void enterFisteName(String value) {
		firstName.sendKeys();

	}

	public void enterLastName(String value) {
		lastName.sendKeys(value);
	}

	public void enterCompanyEmail(String value) {
		companyName.sendKeys(value);

	}

}
