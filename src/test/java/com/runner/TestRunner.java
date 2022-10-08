package com.runner;
import cucumber.api.CucumberOptions; 
import io.cucumber.testng.AbstractTestNGCucumberTests; 

@CucumberOptions(
		features ="src/test/java/com/featureFiles",
		glue = {"src/test/java/com/stepDefinition"},
		tags = {"@Test1","@Test2","@Test3"})

public class TestRunner extends AbstractTestNGCucumberTests {

}

