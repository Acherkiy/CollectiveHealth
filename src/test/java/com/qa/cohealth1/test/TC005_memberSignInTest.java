package com.qa.cohealth1.test;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.cohealth1.frameWork.StartWebDriver;
import com.qa.cohealth1.pageObject.HomePage;
import com.qa.cohealth1.pageObject.MemeberSignInPage;

public class TC005_memberSignInTest extends StartWebDriver {

	@Test
	public void verifyNonMemberSignIn() {

		HomePage hp = new HomePage(driver);
		MemeberSignInPage member = hp.memberSignIn();
		member.enterEmail("fake@fake.com");
		member.enterPassWord("Test1234");
		member.clickSignInBtn();
		Assert.assertTrue(driver.findElement(By.cssSelector(".LoginForm__forgotPasswordLink")).getText().contains("?"));

	}

}
