package com.test;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(format = { "pretty", "html:target/cucumber-html-report" },
	features = { "src/test/resources/features/" },
	glue = {"com.base", 
			"com.steps" },
	tags = { "@Reg1" })
public class TestRunner {

}
