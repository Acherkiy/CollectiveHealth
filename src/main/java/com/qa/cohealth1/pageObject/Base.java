package com.qa.cohealth1.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Base {

	public Base(WebDriver _driver) {

		PageFactory.initElements(_driver, this);
	}

	@FindBy(how = How.XPATH, xpath = "//div[@class='outer-site-wrapper']//div[@class='cf page-wrapper']/footer//div[@class='footer-menu-wrapper']/ul[2]//a[@href='https://collectivehealth.com/about/']")
	private WebElement ourTeam;

	@FindBy(how = How.XPATH, xpath = "//div[@class='inner-site-wrapper']/div[2]/footer[@class='footer bleed-container']//div[@class='column-contents']/li[2]/a[@href='https://collectivehealth.com/our-mission/']")
	private WebElement ourMission;

	@FindBy(how = How.XPATH, xpath = "//div[@class='inner-site-wrapper']/div[2]/footer[@class='footer bleed-container']//div/li[3]/a[@href='https://collectivehealth.com/press/']")
	private WebElement press;

	@FindBy(how = How.XPATH, xpath = "//div[@class='inner-site-wrapper']/div[2]/footer[@class='footer bleed-container']//div[@class='column-contents']/li[4]/a[@href='https://collectivehealth.com/partnerships/']")
	WebElement partnerShips;

	@FindBy(how = How.LINK_TEXT, linkText = "Jobs")
	WebElement jobs;

	@FindBy(how = How.LINK_TEXT, linkText = "MEMBER SIGN IN")
	WebElement memberSignIn;

	public void navigateToMemberSignIn() {

		memberSignIn.click();

	}

	public void navigateToOurTeam() {

		ourTeam.click();

	}

	public void navigateToOurMission() {
		ourMission.click();

	}

	public void navigateToOurPress() {
		press.click();

	}

	public void navigatetoPartnerShips() {
		partnerShips.click();
	}

	protected void navigateToJobs() {

		jobs.click();

	}

}
