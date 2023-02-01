package testRunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src\\test\\resource\\AppFeatures\\Uber_multiple scenarios_in_single.feature"},
		glue = {"stepdefinitions"},
		tags = "@all", 
		plugin= {"pretty", 
				"json:target/MyReports/report.json",
				"junit:target/MyReports/reports.xml"},
		publish = true
		)


public class UberMultiple_Test {

}
