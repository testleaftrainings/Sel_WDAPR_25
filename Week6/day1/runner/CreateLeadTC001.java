package runner;

import base.ProjectSpecificMethods;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(features = {"src/test/resources/features/CreateLead.feature"},
glue ={"steps"},publish = true,
monochrome = true,dryRun = false)
public class CreateLeadTC001 extends ProjectSpecificMethods {

}
