package runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions	(features = "src/test/resources/features/TestFeature.feature", 
					 glue = "stepdefinition", 
					 monochrome = true,
					 publish = true)

public class TestRunner {
}
