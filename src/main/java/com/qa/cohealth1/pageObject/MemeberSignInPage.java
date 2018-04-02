package com.qa.cohealth1.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class MemeberSignInPage extends Base {

	WebDriver webdriver;

	public MemeberSignInPage(WebDriver _driver) {
		super(_driver);
		webdriver = _driver;
	}

	@FindBy(how = How.CSS, css = "#login-email")
	private WebElement email;

	@FindBy(how = How.CSS, css = "#login-password")
	private WebElement passWord;

	public void enterEmail(String value) {

		email.sendKeys(value);
	}

	public void enterPassWord(String value) {

		passWord.sendKeys(value);
	}

	@FindBy(how = How.CSS, css = ".LoginForm__submitButton")
	private WebElement signIn;

	public void clickSignInBtn() {
		signIn.click();

	}

}
