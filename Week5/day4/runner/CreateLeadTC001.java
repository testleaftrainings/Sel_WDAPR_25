package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(features = {"src/test/resources/features/CreateLead.feature"},
glue ={"steps"},publish = true,
monochrome = true,dryRun = false)
public class CreateLeadTC001 extends AbstractTestNGCucumberTests {

}
