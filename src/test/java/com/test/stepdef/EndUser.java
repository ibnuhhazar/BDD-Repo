package com.test.stepdef;

import com.test.utilities.BeforeAfter;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class EndUser extends AbstractStepDefinition {

	public EndUser(BeforeAfter beforeAfter) {
		super(beforeAfter);
	}

	@Given("^i click button En Button in \"([^\"]*)\"$")
	public void i_click_button_En_Button_in(String objectName) throws Throwable {
		eventConnector.click(driver, objectName);
	}

	@When("^i click button No, no in \"([^\"]*)\"$")
	public void i_click_button_No_no_in(String objectName) throws Throwable {
		eventConnector.click(driver, objectName);
	}

	@Then("^verify home page tittle is \"([^\"]*)\" in \"([^\"]*)\"$")
	public void verify_home_page_tittle_is_in(String text, String objectName)
			throws Throwable {
		eventConnector.assertionLabel(driver, text, objectName);
	}
}
