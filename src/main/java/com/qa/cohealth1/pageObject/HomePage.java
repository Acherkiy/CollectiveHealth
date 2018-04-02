package com.qa.cohealth1.pageObject;

import org.openqa.selenium.WebDriver;

public class HomePage extends Base {

	WebDriver webdriver;

	public HomePage(WebDriver _driver) {
		super(_driver);
		webdriver = _driver;

	}

	public OurTeamPage ourTeam() {
		navigateToOurTeam();
		return new OurTeamPage(webdriver);

	}

	public OurMissionPage ourMission() {
		navigateToOurMission();
		return new OurMissionPage(webdriver);

	}

	public JobsPage jobs() {
		navigateToJobs();
		return new JobsPage(webdriver);

	}

	public PartnerShipsPage partnerShips() {
		navigatetoPartnerShips();
		return new PartnerShipsPage(webdriver);

	}

	public MemeberSignInPage memberSignIn() {
		navigateToMemberSignIn();
		return new MemeberSignInPage(webdriver);

	}

}
