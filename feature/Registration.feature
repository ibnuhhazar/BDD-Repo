Feature: Registration

  Background: 
    i have opened a selendroid-test-app

  @demo
  Scenario: Registration user with java programming language
    Given user is on dashboard
    When i click button start register "startUserRegistration"
    And i enter as username "Asterix" in "inputUsername"
    And i enter as email "ibnuhazar@btpn.com" in "inputEmail"
    And i enter as password "Obelix" in "inputPassword"
    And i select as programming language "Java" in "input_preferedProgrammingLanguage"
    And i check checkbox accept adds in "input_adds"
    And i click button register "btnRegisterUser"
    Then i verify, so that "label_preferedProgrammingLanguage_data" is "Java"
