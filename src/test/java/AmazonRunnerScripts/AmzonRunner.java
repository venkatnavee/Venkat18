package AmazonRunnerScripts;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/java/AmazonScripts"},
glue= {"AmazonStepDef"}, plugin = {"html:target/cucumberReport.html"})
public class AmzonRunner {
	

}
