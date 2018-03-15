package com.test.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;
import java.util.Properties;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.remote.DesiredCapabilities;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class BeforeAfter {

	@SuppressWarnings("rawtypes")
	AndroidDriver driver;
	Properties capabilitiesRepo = null;

	@SuppressWarnings("rawtypes")
	@Before
	public void openApplication() throws IOException, InterruptedException {

		DesiredCapabilities desiredCapabilities = new DesiredCapabilities();

		capabilitiesRepo = new Properties();
		FileInputStream fsCapabilities = new FileInputStream(
				System.getProperty("user.dir")
						+ "\\src\\test\\java\\com\\test\\config\\Capabilities.properties");
		capabilitiesRepo.load(fsCapabilities);

		File path = new File(System.getProperty("user.dir")
				+ capabilitiesRepo.getProperty("pathAPK"));

		// Specify the device name (any name)
		desiredCapabilities.setCapability("deviceName", capabilitiesRepo.getProperty("1deviceName"));

		// Platform version
		desiredCapabilities.setCapability("platformVersion", capabilitiesRepo.getProperty("1platformVersion"));

		// platform name
		desiredCapabilities.setCapability("platformName", "Android");
		
		// install Apps
		desiredCapabilities.setCapability(MobileCapabilityType.APP, path.getAbsolutePath());
		
		// specify the application package that we copied from appium
		desiredCapabilities.setCapability("appPackage", capabilitiesRepo.getProperty("appPackage"));

		// specify the application activity that we copied from appium
		desiredCapabilities.setCapability("appActivity", capabilitiesRepo.getProperty("appActivity"));

		driver = new AndroidDriver(
				new URL(capabilitiesRepo.getProperty("1URL")),
				desiredCapabilities);

	}

	@SuppressWarnings("rawtypes")
	public AndroidDriver getDeriver() {
		return this.driver;
	}

	@After
	public void afterTest(Scenario scenario) throws Exception {
		if (scenario.isFailed()) {
			scenario.embed(((TakesScreenshot) driver)
					.getScreenshotAs(OutputType.BYTES), "image/png");
			scenario.write("Scenario Fail");
		} else {
			scenario.write("Scenario Pass");
		}

		driver.quit();
	}
}
