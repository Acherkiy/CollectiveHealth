package com.qa.cohealth1.frameWork;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class StartWebDriver {

	public static WebDriver driver = null;;
	public static WebDriverWait wait = null;

	@BeforeSuite
	public void SetUp() {

		try {
			ReadConfigProperty file = new ReadConfigProperty();
			if ("chrome".equalsIgnoreCase(file.getBrowser())) {
				System.setProperty("webdriver.chrome.driver",
						StartWebDriver.class.getClassLoader().getResource("Resource/chromedriver3").getPath());
				driver = new ChromeDriver();

			} else if ("firefox".equalsIgnoreCase(file.getBrowser())) {
				System.setProperty("webdriver.gecko.driver",
						StartWebDriver.class.getClassLoader().getResource("Resource/geckodriver").getPath());
				driver = new FirefoxDriver();
			} else {
				driver = new HtmlUnitDriver(true);

			}
			driver.get(file.getUrl());
			driver.manage().window().setSize(new Dimension(1440, 900));
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			// new WebDriverWait(driver, 30);

		} catch (Exception e) {
			e.printStackTrace();

		}

	}

	public static WebElement getElement(String locator) {
		if (driver.findElements(By.id(locator)).size() == 1) {
			return driver.findElement(By.id(locator));
		} else if (driver.findElements(By.cssSelector(locator)).size() == 1) {
			return driver.findElement(By.cssSelector(locator));
		} else if (driver.findElements(By.className(locator)).size() == 1) {
			return driver.findElement(By.className(locator));
		} else if (driver.findElements(By.name(locator)).size() == 1) {
			return driver.findElement(By.name(locator));
		} else if (driver.findElements(By.xpath(locator)).size() == 1) {
			return driver.findElement(By.xpath(locator));
		} else
			throw new NoSuchElementException("NO such Element " + locator);
	}

	@AfterSuite(alwaysRun = true)
	public void TearDown() {
		try {
			driver.close();
			driver.quit();
			if (driver != null)
				driver = null;

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
