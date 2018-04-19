@FunctionalTest
Feature: End user

  Background: 
    i have opened a selendroid-test-app
	
	@demo
	Scenario:
		Given i at the dashboard
		When i click button En in "buttonTest"
		When i click button No, no in "button2"
		Then verify home page tittle is "selendroid-test-app" in "title" 