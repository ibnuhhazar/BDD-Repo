package com.test.eventConnector;

import io.appium.java_client.android.AndroidDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.testng.AssertJUnit;

public class EventConnector {

	Properties objectRepo = null;

	public EventConnector() {

		try {
			objectRepo = new Properties();
			FileInputStream fsOR = new FileInputStream(
					System.getProperty("user.dir")
							+ "\\src\\test\\java\\com\\test\\config\\ObjectRepo.properties");
			objectRepo.load(fsOR);

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	@SuppressWarnings("rawtypes")
	public void click(AndroidDriver driver, String objectName) {
		driver.findElement(By.id(objectRepo.getProperty(objectName))).click();
	}

	@SuppressWarnings("rawtypes")
	public void clickByName(AndroidDriver driver, String objectName) {
		driver.findElement(By.name(objectName)).click();
	}

	@SuppressWarnings("rawtypes")
	public void input(AndroidDriver driver, String text, String objectName) {
		driver.findElement(By.id(objectRepo.getProperty(objectName))).sendKeys(
				text);
		;
	}

	@SuppressWarnings("rawtypes")
	public void select(AndroidDriver driver, String text, String objectName) {
		driver.findElement(By.id(objectRepo.getProperty(objectName))).click();
		driver.findElement(By.name(text)).click();
	}

	@SuppressWarnings("rawtypes")
	public void assertionLabel(AndroidDriver driver, String text,
			String objectName) {
		String getText = driver.findElement(
				By.id(objectRepo.getProperty(objectName))).getText();
		AssertJUnit.assertEquals(text, getText);
	}
	
	@SuppressWarnings("rawtypes")
	public void quit(AndroidDriver driver) {
		driver.quit();
	}
	
}
