package com.test.stepdef;

import com.test.utilities.BeforeAfter;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RegistrationUser extends AbstractStepDefinition {

	public RegistrationUser(BeforeAfter beforeAfter) {
		super(beforeAfter);
	}

	@Given("^i have opened a selendroid-test-app$")
	public void i_have_opened_a_selendroid_test_app() throws Throwable {
		
	}

	@Given("^i click button start register \"(.*?)\"$")
	public void i_click_button_start_register(String objectName)
			throws Throwable {
		eventConnector.click(driver, objectName);
	}

	@Given("^i enter as username \"(.*?)\" in \"(.*?)\"$")
	public void i_enter_as_username_in(String text, String objectName)
			throws Throwable {
		eventConnector.input(driver, text, objectName);
	}

	@Given("^i enter as email \"(.*?)\" in \"(.*?)\"$")
	public void i_enter_as_email_in(String text, String objectName)
			throws Throwable {
		eventConnector.input(driver, text, objectName);
	}

	@Given("^i enter as password \"(.*?)\" in \"(.*?)\"$")
	public void i_enter_as_password_in(String text, String objectName)
			throws Throwable {
		eventConnector.input(driver, text, objectName);
	}

	@Given("^i select as programming language \"(.*?)\" in \"(.*?)\"$")
	public void i_select_as_programming_language_in(String text,
			String objectName) throws Throwable {
		eventConnector.select(driver, text, objectName);
	}

	@Given("^i check as accept adds in \"(.*?)\"$")
	public void i_check_as_accept_adds_in(String objectName) throws Throwable {
		eventConnector.click(driver, objectName);
	}

	@When("^i click button register \"(.*?)\"$")
	public void i_click_button_register(String objectName) throws Throwable {
		eventConnector.click(driver, objectName);
	}

	@Then("^verify user will be display \"(.*?)\" in \"(.*?)\"$")
	public void verify_user_will_be_display_in(String text, String objectName)
			throws Throwable {
		eventConnector.assertionLabel(driver, text, objectName);
	}
	
	@Given("^i click button open chroom in \"(.*?)\"$")
	public void i_click_button_open_chroom_in(String objectName)
			throws Throwable {
		eventConnector.click(driver, objectName);
	}

	@Given("^i click button spinner Webdriver Test Data in \"(.*?)\"$")
	public void i_click_button_spinner_Webdriver_Test_Data_in(String objectName)
			throws Throwable {
		eventConnector.click(driver, objectName);
	}

	@Given("^i select as \"(.*?)\"$")
	public void i_select_as(String objectName) throws Throwable {
		eventConnector.clickByName(driver, objectName);
	}

	@When("^i click button \"(.*?)\"$")
	public void i_click_button(String objectName) throws Throwable {
		eventConnector.click(driver, objectName);
	}

	@Then("^verify home page display tittle is \"(.*?)\" in \"(.*?)\"$")
	public void verify_home_page_display_tittle_is_in(String text,
			String objectName) throws Throwable {
		eventConnector.assertionLabel(driver, text, objectName);		
	}
	
}
