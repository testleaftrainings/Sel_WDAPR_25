package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificMethods;
import io.cucumber.java.en.When;

public class LoginPage extends ProjectSpecificMethods {

	public LoginPage(ChromeDriver driver) {
		this.driver=driver;
	}
	@When("The user enters the username as {string}")
	public LoginPage enterUserName(String uname) {
		System.out.println(driver);
		driver.findElement(By.id("username")).sendKeys(uname);
		return this;
	}
	@When("The user enters the password as {string}")
	public LoginPage enterPassword(String pword) {
		driver.findElement(By.id("password")).sendKeys(pword);
		return this;
	}
	@When("The user clicks the login button")
	public WelcomePage clickLoginButton() {
		driver.findElement(By.className("decorativeSubmit")).click();
		return new WelcomePage(driver);
	}
	
	
}
