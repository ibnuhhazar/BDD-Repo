package com.test.utilities;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = { "json:C://FeatureFile//Log//cucumber.json","html:target//cucumber-pretty" }, 
		features = { "C://FeatureFile//Feature" },
	    tags = { "@FunctionalTest" },
		glue = { "com.test.stepdef", "com.test.utilities" })
public class Runner {
	
}
