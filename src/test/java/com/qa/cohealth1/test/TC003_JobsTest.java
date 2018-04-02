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
import com.qa.cohealth1.pageObject.JobsPage;
import com.qa.cohealth1.pageObject.OpenPositionsPage;

public class TC003_JobsTest extends StartWebDriver {

	@Test
	public void VerifyJobsQaEnginerLink() {

		HomePage hp = new HomePage(driver);
		JobsPage jp = hp.jobs();
		OpenPositionsPage opp = jp.viewOpenPosition();
		opp.goToQaEngineer();
		ComboBoxHelper.switchTo(1);
		AssertJUnit.assertEquals(
				driver.findElement(By.xpath("//section[@id='job-application']//h1[.='QA Engineer (Web Applications)']"))
						.getText(),
				"QA Engineer (Web Applications)");
		ComboBoxHelper.switchToParentWithClose(0);
	}

}
