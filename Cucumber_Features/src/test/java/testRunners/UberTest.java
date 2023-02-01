package testRunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src\\test\\resource\\AppFeatures\\Uber.feature"},
		glue = {"stepdefinitions"},plugin= {"pretty", "html:target/reports"}
		)
public class UberTest
{

}
