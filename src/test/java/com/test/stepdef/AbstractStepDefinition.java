package com.test.stepdef;

import io.appium.java_client.android.AndroidDriver;

import com.test.eventConnector.EventConnector;
import com.test.utilities.BeforeAfter;

public abstract class AbstractStepDefinition {

	@SuppressWarnings("rawtypes")
	protected AndroidDriver driver ;
	
	EventConnector eventConnector = new EventConnector() ;
	
	protected AbstractStepDefinition(BeforeAfter beforeAfter) {
		this.driver = beforeAfter.getDeriver();
	}

}
