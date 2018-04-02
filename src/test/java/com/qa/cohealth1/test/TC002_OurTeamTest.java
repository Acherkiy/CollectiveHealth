package com.qa.cohealth1.test;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.cohealth1.frameWork.ComboBoxHelper;
import com.qa.cohealth1.frameWork.StartWebDriver;
import com.qa.cohealth1.pageObject.HomePage;
import com.qa.cohealth1.pageObject.OurTeamPage;

public class TC002_OurTeamTest extends StartWebDriver {

	@Test(enabled = true)
	public void VerifyAliDiabPtr() throws InterruptedException {

		HomePage hp = new HomePage(driver);
		OurTeamPage otp = hp.ourTeam();
		ComboBoxHelper.javaScriptExecuter("window.scrollTo(0,2000)");
		// wait.until(ExpectedConditions.visibilityOf(StartWebDriver.getElement("aliDiabPhoto")));
		otp.clickAliDiabPtr();
		AssertJUnit.assertTrue(StartWebDriver.getElement(".qtip-content .bio-close").isDisplayed());
		otp.clickXbtnAliDiabPct();
	}

}
