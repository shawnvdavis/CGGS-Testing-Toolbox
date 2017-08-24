package com.cggs.framework.runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
 
@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/feature"
		,glue={"com.cggs.framework.stepDefinition"}
		)
 
public class TestRunner {
 
}
