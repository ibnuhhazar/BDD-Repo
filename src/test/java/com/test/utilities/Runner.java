package com.test.utilities;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = { "json:target/cucumber.json","html:target/site/cucumber-pretty" }, 
		features = { "src/test/resources/feature" },
	    tags = { "@tag1,@tag2,@tag3" },
		glue = { "com.test.stepdef", "com.test.utilities" })
public class Runner {

}
