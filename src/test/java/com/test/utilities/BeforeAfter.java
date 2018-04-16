package com.test.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;
import java.util.Properties;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

import org.apache.log4j.Logger;
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

	Logger logger;

	@SuppressWarnings("rawtypes")
	@Before
	public void openApplication() throws IOException, InterruptedException {

		logger = Logger.getLogger(BeforeAfter.class);

		logger.debug("Before Hook ...............................................");

		DesiredCapabilities desiredCapabilities = new DesiredCapabilities();

		capabilitiesRepo = new Properties();
		FileInputStream fsCapabilities = new FileInputStream(
				System.getProperty("user.dir")
						+ "\\src\\test\\java\\com\\test\\config\\Capabilities.properties");
		capabilitiesRepo.load(fsCapabilities);

		File path = new File(System.getProperty("user.dir")
				+ capabilitiesRepo.getProperty("pathAPK"));

		// Specify the device name (any name)
		desiredCapabilities.setCapability("deviceName",
				capabilitiesRepo.getProperty("1deviceName"));

		// Platform version
		desiredCapabilities.setCapability("platformVersion",
				capabilitiesRepo.getProperty("1platformVersion"));

		// platform name
		desiredCapabilities.setCapability("platformName", "Android");

		// install Apps
		desiredCapabilities.setCapability(MobileCapabilityType.APP,
				path.getAbsolutePath());

		logger.debug("Open Apps ...............................................");

		desiredCapabilities.setCapability("appPackage",
				capabilitiesRepo.getProperty("appPackage"));

		desiredCapabilities.setCapability("appActivity",
				capabilitiesRepo.getProperty("appActivity"));

		driver = new AndroidDriver(
				new URL(capabilitiesRepo.getProperty("1URL")),
				desiredCapabilities);

		/*
		 * String kobitonServerUrl =
		 * "https://boden:ac9a9d82-4a44-476a-b759-251dead4b2b8@api.kobiton.com/wd/hub"
		 * ;
		 * 
		 * DesiredCapabilities capabilities = new DesiredCapabilities();
		 * capabilities.setCapability("sessionName", "Automation test session");
		 * capabilities.setCapability("sessionDescription", "");
		 * capabilities.setCapability("deviceOrientation", "portrait");
		 * capabilities.setCapability("captureScreenshots", true);
		 * capabilities.setCapability("deviceGroup", "KOBITON");
		 * capabilities.setCapability("deviceName", "Galaxy Note5");
		 * capabilities.setCapability("platformVersion", "6.0.1");
		 * capabilities.setCapability("platformName", "Android");
		 * capabilities.setCapability("app", "kobiton-store:8235");
		 * capabilities.setCapability("appPackage", "io.selendroid.testapp");
		 * capabilities.setCapability("appActivity", ".HomeScreenActivity");
		 * 
		 * driver = new AndroidDriver(new URL(kobitonServerUrl), capabilities);
		 */

		logger.debug("Create Session ..............................................."
				+ driver);

	}

	@SuppressWarnings("rawtypes")
	public AndroidDriver getDeriver() {
		return this.driver;
	}

	@After
	public void afterTest(Scenario scenario) throws Exception {
		logger = Logger.getLogger(BeforeAfter.class);

		logger.debug("After Hook ...............................................");

		if (scenario.isFailed()) {
			scenario.embed(((TakesScreenshot) driver)
					.getScreenshotAs(OutputType.BYTES), "image/png");
			scenario.write("Scenario Fail");
		} else {
			scenario.write("Scenario Pass");
		}

		logger.debug("Quit Session ..............................................."
				+ driver);

		driver.quit();
	}
}
