package testRunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src\\test\\resource\\AppFeatures\\DataTables_UserRegistration.feature"},
		glue = {"stepdefinitions"},
		plugin = {"pretty",
				"json:target/MyReports/reports.json",
				"junit:target/MyReports/report.xml"},
		publish = true
		)
public class DataTables_UserRegistrationTest {

}
