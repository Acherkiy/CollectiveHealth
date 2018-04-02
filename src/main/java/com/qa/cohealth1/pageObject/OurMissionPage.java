package com.qa.cohealth1.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class OurMissionPage extends Base {

	WebDriver webdriver;

	public OurMissionPage(WebDriver _driver) {
		super(_driver);
		webdriver = _driver;
	}

	@FindBy(how = How.XPATH, xpath = "//div[@id='the-benefits-of-doing-things-differently']//a[@href='http://offers.collectivehealth.com/hbr-report-the-growing-divide-in-employer-sponsored-health-benefits']//span[.='Get the report']")
	private WebElement getTheReport;

	public void goToGetTheReport() {

		getTheReport.click();

	}

}
