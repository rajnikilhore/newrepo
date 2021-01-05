package TestRunner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
features = "src/test/java/features/OlaCorportae1.feature"
,glue= {"StepDefination","utility"},
dryRun=false,
monochrome=true,
//plugin = { "pretty", "html:target/cucumber-pretty"})
//plugin = { "pretty", "json:target/cucumber.json"})
//tags= {"@smoke ,@regression"}, //or condition
//tags= {"@smoke" ,"@regression"} //and condition
//tags= {"~@smoke"} //skip scenarios taged with smoke tag
tags = {"@ola"},
plugin = { "pretty", "junit:target/cucumber1.xml"})


public class TestRunner {
	
	

}
