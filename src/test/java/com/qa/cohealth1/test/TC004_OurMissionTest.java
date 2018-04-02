package com.qa.cohealth1.test;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.cohealth1.frameWork.ComboBoxHelper;
import com.qa.cohealth1.frameWork.StartWebDriver;
import com.qa.cohealth1.pageObject.HomePage;
import com.qa.cohealth1.pageObject.OurMissionPage;

public class TC004_OurMissionTest extends StartWebDriver {
	@Test
	public void verifyOurMissionLink() {

		HomePage hp = new HomePage(driver);
		OurMissionPage omp = hp.ourMission();
		// ComboBoxHelper.javaScriptExecuter("window.scrollTo(0,14000)");
		omp.goToGetTheReport();
		ComboBoxHelper.switchTo(1);
		AssertJUnit.assertTrue(driver.findElement(By.cssSelector("[type='submit']")).isDisplayed());

		ComboBoxHelper.switchToParentWithClose(0);
	}

}
