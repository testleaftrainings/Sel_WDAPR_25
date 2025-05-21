package runner;

import org.testng.annotations.Test;

import base.ProjectSpecificMethods;
import pages.LoginPage;

public class TC002CreateLead extends ProjectSpecificMethods {
	@Test
	public void runCreateLead(String uname , String pword) {
		LoginPage user = new LoginPage(driver);
		//Fluent Interface --> which is like the sentence
		user.enterUserName(uname)
		.enterPassword(pword)
		.clickLoginButton()
		.clickCRMSFALink()
		.clickLeadsTab()
		.clickCreateLeadMenu();
	}
}
