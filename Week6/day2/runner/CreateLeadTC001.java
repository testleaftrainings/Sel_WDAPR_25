package runner;

import base.ProjectSpecificMethods;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(features = {"src/test/resources/features"},
glue ={"steps"},publish = true,
monochrome = true,dryRun = false,
tags = "not @negative")
public class CreateLeadTC001 extends ProjectSpecificMethods {

}
