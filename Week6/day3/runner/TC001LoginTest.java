package runner;

import org.testng.annotations.Test;

import base.ProjectSpecificMethods;
import pages.LoginPage;

public class TC001LoginTest extends ProjectSpecificMethods {
	@Test
	public void runLoginTest(String uname , String pword ) {
		LoginPage user = new LoginPage(driver);
		//Fluent Interface --> which is like the sentence
		user.enterUserName(uname).enterPassword(pword).clickLoginButton().clickCRMSFALink();
}}
