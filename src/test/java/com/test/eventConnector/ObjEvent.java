package com.test.eventConnector;

import java.io.File;
import java.util.Scanner;

import io.appium.java_client.android.AndroidDriver;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.testng.AssertJUnit;

public class ObjEvent {

	String packageApp = "io.selendroid.testapp:id/";
	String androidPackage = "android:id/";

	Logger logger = Logger.getLogger(ObjEvent.class);

	private static Scanner x;

	@SuppressWarnings("rawtypes")
	public void logon(AndroidDriver driver, String userID) {
		boolean found = false;
		
		String filePath = "\\LogFile\\DataFile\\test.txt";
		String searchTerm = userID;
		String ID = "";
		String email = "";
		String password = "";

		try {
			x = new Scanner(new File(filePath));
			x.useDelimiter("[,\n]");

			while (x.hasNext() && !found) {
				ID = x.next();
				email = x.next();
				password = x.next();

				if (ID.equals(searchTerm)) {
					found = true;
				}
			}

			if (found) {
				logger.debug("Find Element "
						+ driver.findElement(By
								.id("io.selendroid.testapp:id/inputUsername")));
				driver.findElement(
						By.id("io.selendroid.testapp:id/inputUsername"))
						.sendKeys(ID);

				logger.debug("Find Element "
						+ driver.findElement(By
								.id("io.selendroid.testapp:id/inputEmail")));
				driver.findElement(By.id("io.selendroid.testapp:id/inputEmail"))
						.sendKeys(email);
				
				logger.debug("Find Element "
						+ driver.findElement(By
								.id("io.selendroid.testapp:id/inputPassword")));
				driver.findElement(
						By.id("io.selendroid.testapp:id/inputPassword"))
						.sendKeys(password.trim());

			} else {
				System.out.println("Record Not Found: ");
			}

		} catch (Exception e) {
			System.out.println(e);
		}
	}

	@SuppressWarnings("rawtypes")
	public void tap(AndroidDriver driver, String objectName) {

		try {
			logger.debug("Find Element "
					+ driver.findElement(By.id(packageApp + objectName)));
			driver.findElement(By.id(packageApp + objectName)).click();
		} catch (Exception a) {
			try {
				logger.debug("Find Element "
						+ driver.findElement(By.name(objectName)));
				driver.findElement(By.name(objectName)).click();
			} catch (Exception b) {
				logger.debug("Find Element "
						+ driver.findElement(By.id(androidPackage + objectName)));
				driver.findElement(By.id(androidPackage + objectName)).click();
			}
		}
	}

	@SuppressWarnings("rawtypes")
	public void setText(AndroidDriver driver, String text, String objectName) {
		logger.debug("Find Element "
				+ driver.findElement(By.id(packageApp + objectName)));
		driver.findElement(By.id(packageApp + objectName)).sendKeys(text);
	}

	@SuppressWarnings("rawtypes")
	public void selectListItemBylabel(AndroidDriver driver, String text,
			String objectName) {
		logger.debug("Find Element "
				+ driver.findElement(By.id(packageApp + objectName)));		
		driver.findElement(By.id(packageApp + objectName)).click();
		
		logger.debug("Find Element "
				+ driver.findElement(By.name(text)));
		driver.findElement(By.name(text)).click();
	}

	@SuppressWarnings("rawtypes")
	public void checkElement(AndroidDriver driver, String objectName) {
		try {
			logger.debug("Find Element "
					+ driver.findElement(By.id(packageApp + objectName)));
			driver.findElement(By.id(packageApp + objectName)).click();
		} catch (Exception a) {
			try {
				logger.debug("Find Element "
						+ driver.findElement(By.name(objectName)));
				driver.findElement(By.name(objectName)).click();
			} catch (Exception b) {
				logger.debug("Find Element "
						+ driver.findElement(By.id(androidPackage + objectName)));
				driver.findElement(By.id(androidPackage + objectName)).click();
			}
		}
	}

	@SuppressWarnings("rawtypes")
	public void verifyEqual(AndroidDriver driver, String objectName, String text) {
		try {
			logger.debug("Find Element " + By.id(androidPackage + objectName));
			String getText = driver.findElement(
					By.id(androidPackage + objectName)).getText();
			AssertJUnit.assertEquals(text, getText);

		} catch (Exception e) {
			logger.debug("Find Element "
					+ driver.findElement(By.id(packageApp + objectName)));
			String getText = driver.findElement(By.id(packageApp + objectName))
					.getText();
			AssertJUnit.assertEquals(text, getText);
		}
	}

	@SuppressWarnings("rawtypes")
	public void verifyElementExist(AndroidDriver driver, String objectName) {
		try {
			logger.debug("Find Element "
					+ driver.findElement(By.id(packageApp + objectName)));
			driver.findElement(By.id(packageApp + objectName)).isDisplayed();
		} catch (Exception a) {
			try {
				logger.debug("Find Element "
						+ driver.findElement(By.name(objectName)));
				driver.findElement(By.name(objectName)).isDisplayed();
			} catch (Exception b) {
				logger.debug("Find Element "
						+ driver.findElement(By.id(androidPackage + objectName)));
				driver.findElement(By.id(androidPackage + objectName))
						.isDisplayed();
			}
		}
	}
}
