package runnerBDD;

import base.ProjectSpecificMethods;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = {"src/test/java/features/CreateLead.feature"},glue = {"pages"},
publish = true,monochrome = true,dryRun = false )
public class CreateLeadBDD  extends ProjectSpecificMethods{

}
