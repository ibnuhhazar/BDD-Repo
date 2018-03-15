package com.test.utilities;

import io.appium.java_client.remote.MobileCapabilityType;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.remote.DesiredCapabilities;

public class CapabilityParamSet {
	
	public void capabilitysSet(String deviceName_, String URL_,
			String platformVersion_, File path, String appPackage_, String appActivity_,DesiredCapabilities capabilities)
			throws InterruptedException, IOException {

		// Specify the device name (any name)
		capabilities.setCapability("deviceName", deviceName_);

		// Platform version
		capabilities.setCapability("platformVersion", platformVersion_);

		// platform name
		capabilities.setCapability("platformName", "Android");
			
		capabilities.setCapability(MobileCapabilityType.APP, path.getAbsolutePath());
		
		// specify the application package that we copied from appium
		capabilities.setCapability("appPackage", appPackage_);

		// specify the application activity that we copied from appium
		capabilities.setCapability("appActivity", appActivity_);
		
	}
}
