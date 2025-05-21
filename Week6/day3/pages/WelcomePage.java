package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificMethods;
import io.cucumber.java.en.When;

public class WelcomePage extends ProjectSpecificMethods {
	
	public WelcomePage(ChromeDriver driver) {
		this.driver=driver;
	}
	@When("The user clicks the crmsfa link")
	public MyHomePage clickCRMSFALink() {
		driver.findElement(By.linkText("CRM/SFA")).click();
		return new MyHomePage(driver);
	}

}
