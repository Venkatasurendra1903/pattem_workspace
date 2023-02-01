package testRunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
features = {"src\\test\\resource\\AppFeatures\\Scenario_outline2.feature"},
glue = {"stepdefinitions"},
plugin = {"pretty",
		"json:target/MyReports/reports.json",
		"junit:target/MyReports/report.xml"},
publish = true)
public class Scenario_outline2_Test{

}
