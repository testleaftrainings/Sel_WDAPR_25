package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificMethods;
import io.cucumber.java.en.When;

public class MyLeadsPage extends ProjectSpecificMethods {
	
	public MyLeadsPage(ChromeDriver driver) {
	this.driver=driver;
	}
	@When("The user clicks the create lead shortcut menu")
	public CreateLeadPage clickCreateLeadMenu() {
		driver.findElement(By.linkText("Create Lead")).click();
		return new CreateLeadPage();
	}
	
}
