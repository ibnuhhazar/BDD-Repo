package com.test.stepdef;

import org.apache.log4j.Logger;

import com.test.utilities.BeforeAfter;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class StepDefinition extends AbstractStepDefinition {

	final static Logger logger = Logger.getLogger(StepDefinition.class);
	
	public StepDefinition(BeforeAfter beforeAfter) {
		super(beforeAfter);
	}
	
	@Given(".*?loged.*? \"(.*?)\"$")
	public void login(String userID){
		logger.debug("tap Object " + userID);
		objEvent.logon(driver, userID);
	}
	
	@Given(".*?click.*? \"(.*?)\"$")
	public void tap(String objectName) {
		logger.debug("tap Object " + objectName);
		objEvent.tap(driver, objectName);
	}
	
	@Given(".*?enter.*? \"(.*?)\" in \"(.*?)\"$")
	public void setText(String text, String objectName) {
		logger.debug("setText " + text + " in Object element " + objectName);
		objEvent.setText(driver, text, objectName);
	}

	@Given(".*?select.*? \"(.*?)\" in \"(.*?)\"$")
	public void selectListItemBylabel(String text,
			String objectName) {
		logger.debug("selectListItemBylabel " + text + " in Object element " + objectName);
		objEvent.selectListItemBylabel(driver, text, objectName);
	}
	
	@Given(".*?check.*? \"(.*?)\"$")
	public void checkElement(String objectName) {
		logger.debug("checkElement Object element " + objectName);
		objEvent.checkElement(driver, objectName);
	}
	
	@Given(".*?display.*? \"(.*?)\"$")
	public void verifyElementExist(String objectName) {
		logger.debug("verifyElementExist Object element " + objectName);
		objEvent.verifyElementExist(driver, objectName);
	}

	@Then(".*?verify.*? \"(.*?)\" in \"(.*?)\"$")
	public void verifyEqual(String text, String objectName) {
		logger.debug("verifyEqual Object element " + objectName);
		objEvent.verifyEqual(driver, text, objectName);
	}	
}
