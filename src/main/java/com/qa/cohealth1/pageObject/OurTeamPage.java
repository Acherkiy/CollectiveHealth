package com.qa.cohealth1.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class OurTeamPage extends Base {

	WebDriver webdriver;

	public OurTeamPage(WebDriver _driver) {
		super(_driver);

		webdriver = _driver;
	}

	@FindBy(how = How.XPATH, xpath = "//div[@id='about-leadership']//img[@alt='Ali Diab']")
	private WebElement aliDiabPhoto;

	@FindBy(how = How.CSS, css = ".qtip-content .bio-close")
	private WebElement xBtn;

	public void clickAliDiabPtr() {
		aliDiabPhoto.click();

	}

	public void clickXbtnAliDiabPct() {

		xBtn.click();

	}

}
