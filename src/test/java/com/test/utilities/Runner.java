package com.test.utilities;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = { "json:cucumber.json","html:target//cucumber-pretty" }, 
		features = { "FeatureFile//Feature" },
	    tags = { "@FunctionalTest" },
		glue = { "com.test.stepdef", "com.test.utilities" })
public class Runner {
	
}
