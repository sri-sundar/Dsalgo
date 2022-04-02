package testrunner;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features="src/test/resources/features/",
		glue = {"com/DsAlgo/StepDefinition"},
		dryRun =false,
		monochrome=true,
		plugin = {"pretty","html:target/cucumber-html-reports"}
		
		)

				
				public class TestRunner {
		}