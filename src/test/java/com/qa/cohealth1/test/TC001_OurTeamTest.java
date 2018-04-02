package com.qa.cohealth1.test;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import com.qa.cohealth1.frameWork.StartWebDriver;
import com.qa.cohealth1.pageObject.HomePage;
import com.qa.cohealth1.pageObject.OurTeamPage;

public class TC001_OurTeamTest extends StartWebDriver {

	@Test(enabled = true)
	public void verifyOurTeamLink() {
		HomePage hp = new HomePage(driver);
		OurTeamPage otp = hp.ourTeam();
	}

}
