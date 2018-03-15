Feature: Registration user

  Background: 
    Given i have opened a selendroid-test-app
	@tag1
  Scenario Outline: Registration user with Programming language is Java
    And i click button start register "startUserRegistration"
    And i enter as username "<username>" in "inputUsername"
    And i enter as email "ibnuhazar@btpn.com" in "inputEmail"
    And i enter as password "<password>" in "inputPassword"
    And i select as programming language "Java" in "inputPreferedProgrammingLanguage"
    And i check as accept adds in "inputAdds"
    When i click button register "btnRegisterUser"
    Then verify user will be display "Java" in "labelPreferedProgrammingLanguage"
		
    Examples: 
      | username | password |
      | ibnuh    | jakob    |
      | fhadel   | raka     |

	@tag2
  Scenario: Web View with dropdown say hello
    And i click button open chroom in "buttonStartWebview"
    And i click button spinner Webdriver Test Data in "spinnerWebdriverTestData"
    And i select as "formPage"
    When i click button "goBack"
    Then verify home page display tittle is "selendroid-test-appa" in "title"
