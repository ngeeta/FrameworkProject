package com.LinkedIn.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/resources/features/LinkedIn.feature",
		glue={"com.LinkedIn.stepDefinitions","com.LinkedIn.driverSetUp"},
		plugin= {"pretty",
				"html:target/LinkedInLearningReports/LinkedInLearningHtmlReport.html",
				"html:target/LinkedInLearningReports/LinkedInLearningJsonReport.json",
				"html:target/LinkedInLearningReports/LinkedInLearningJunitReport.xml"},
		name= {"To set weekly goal","search courses via excel","Save courses from leadership & management",
				"create collection for coding practice",
				"course search via data table"})
public class LinkedInJunitRunner {

}
