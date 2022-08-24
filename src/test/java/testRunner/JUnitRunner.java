package testRunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/test/resources/features/Login.feature"},
		glue = {"stepDefinitions"},
		monochrome = true,
		dryRun = false,
		//tags = "@regression", //this will run all the feature files with @regression tag
		//tags = "@smoke", //this will run all the scenarios with the smoke tag
		//tags = "@regression and @negative", //this will run all the scenarios with both @regression and @negative tags 
		//tags = "not @positive", // this will skip all the scenarios with this not @positive tag
		tags = "@checkout",
		plugin = {"pretty","html:target/cucumber-html-report/report.html","json:target/cucumber-reports/cucumber.json", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
        })
public class JUnitRunner {
}
