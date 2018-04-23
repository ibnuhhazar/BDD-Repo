@FunctionalTest
Feature: Registration user

  Background: 
    i have opened a selendroid-test-app
  @sad  
  Scenario Outline: Registration user with Programming language is Java
    Given i at the dashboard
    When i click button start register "startUserRegistration"
		And i loged as "ibnuh" 
    And i select as programming language "Java" in "input_preferedProgrammingLanguage"
    And i check checkbox accept adds in "input_adds"
    And i click button register "btnRegisterUser"
    Then i verify, so that "label_preferedProgrammingLanguage_data" is "Java"
		
    Examples: 
      | username | password |
      | ibnuh    | jakob    |

	@Smoketest @EndtoEnd
  Scenario: Web View with dropdown say hello
    Given i at the dashboard
    When i click button open chroom in "buttonStartWebview"
    And i click button spinner Webdriver Test Data in "spinner_webdriver_test_data"
    And i click as "formPage"
    And i click button "goBack"
    Then i verify "title" is "selendroid-test-appa" 