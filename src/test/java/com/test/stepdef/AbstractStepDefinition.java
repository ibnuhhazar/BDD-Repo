package com.test.stepdef;

import io.appium.java_client.android.AndroidDriver;

import com.test.eventConnector.ObjEvent;
import com.test.utilities.BeforeAfter;

public abstract class AbstractStepDefinition {

	@SuppressWarnings("rawtypes")
	protected AndroidDriver driver ;
	ObjEvent objEvent = new ObjEvent();
	
	public AbstractStepDefinition(BeforeAfter beforeAfter) {
		this.driver = beforeAfter.getDeriver();
	}
}
