package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificMethods;
import io.cucumber.java.en.When;

public class MyHomePage extends ProjectSpecificMethods {
	public MyHomePage(ChromeDriver driver) {
		this.driver=driver;
	}
	@When("The user clicks the leads module")
	public MyLeadsPage clickLeadsTab() {
		driver.findElement(By.linkText("Leads")).click();
		return new MyLeadsPage(driver);
	}
}
