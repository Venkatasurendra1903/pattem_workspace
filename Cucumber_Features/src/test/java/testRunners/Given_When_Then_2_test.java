package testRunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src\\test\\resource\\AppFeatures\\Given_When_Then_2.feature"},
		glue = {"stepdefinitions"},
		plugin = {"pretty",
				"json:target/MyReports/reports.json",
				"junit:target/MyReports/report.xml"},
		publish = true)
public class Given_When_Then_2_test {

}
