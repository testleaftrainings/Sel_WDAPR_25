package steps;

import org.openqa.selenium.By;
import base.ProjectSpecificMethods;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitionTwo extends ProjectSpecificMethods {

	@When("The user clicks the crmsfa link")
	public void the_user_clicks_the_crmsfa_link() {
		System.out.println("value of the driver in StepDefinitionTwo is " + driver);
		driver.findElement(By.linkText("CRM/SFA")).click();
	}

	@When("The user clicks the leads module")
	public void the_user_clicks_the_leads_module() {
		driver.findElement(By.linkText("Leads")).click();
	}

	@When("The user clicks the create lead shortcut menu")
	public void the_user_clicks_the_create_lead_shortcut_menu() {
		driver.findElement(By.linkText("Create Lead")).click();
	}

	@When("The user enters the company name as (.*)$")
	public void the_user_enters_the_company_name_as_testleaf(String cname) {
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cname);
	}

	@When("The user enters the first name as (.*)$")
	public void the_user_enters_the_first_name_as_bhuvanesh(String fname) {
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fname);
	}

	@When("The user enters the last name as (.*)$")
	public void the_user_enters_the_last_name_as_m(String lname) {
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lname);
	}

	@When("The user enters the phone number as (.*)$")
	public void the_user_enters_the_phone_number(String phno) {
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys(phno);
	}

	@When("The user clicks the create lead button")
	public void the_user_clicks_the_create_lead_button() {
		driver.findElement(By.name("submitButton")).click();
	}

	@Then("The user should be redirected to the view lead page")
	public void the_user_should_be_redirected_to_the_view_lead_page(String cname) {
		String text = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		if (text.contains(cname)) {
			System.out.println("Lead created successfully");
		} else {
			System.out.println("Lead is not created");
		}
	}

	@Then("The user should encounter the error as parameter is missing")
	public void the_user_should_encounter_the_error_as_parameter_is_missing() {
		System.out.println("the error as parameter is missing is shooted");
	}
}
