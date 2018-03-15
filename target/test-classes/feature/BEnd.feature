Feature: End user

  Background: 
    Given i have opened a selendroid-test-app
	
	@tag3
	Scenario:
		And i click button En Button in "buttonTest"
		When i click button No, no in "button2"
		Then verify home page tittle is "selendroid-test-app" in "title" 