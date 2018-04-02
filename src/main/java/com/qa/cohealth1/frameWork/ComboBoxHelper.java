package com.qa.cohealth1.frameWork;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

public class ComboBoxHelper extends StartWebDriver {

	public static void switchTo(int index) {

		try {

			List<String> win = new ArrayList<String>(driver.getWindowHandles());
			driver.switchTo().window(win.get(index));
		} catch (IndexOutOfBoundsException e) {

			throw new IndexOutOfBoundsException("invalid index " + index);

		}

	}

	public static void switchToParentWithClose(int index) {

		List<String> win = new ArrayList<String>(driver.getWindowHandles());
		for (int i = 1; i < win.size(); i++) {
			driver.switchTo().window(win.get(i));
			driver.close();
		}
		driver.switchTo().window(win.get(0));

	}

	public static void textBoxHelper(String locator, String value) {
		WebElement el = getElement(locator);
		el.sendKeys(value);

	}

	public static void javaScriptExecuter(String script) {
		JavascriptExecutor exu = (JavascriptExecutor) driver;
		exu.executeScript(script);
	}

	public static void takeScreenShot(String fileName) {
		try {
			File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(src, new File("ScreenShots/" + fileName + ".jpg"));
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
