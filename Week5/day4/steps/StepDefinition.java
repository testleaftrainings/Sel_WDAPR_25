package steps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

import base.ProjectSpecificMethods;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition extends ProjectSpecificMethods {
	//ChromeDriver driver;
	@Given("The user successfully establishes the environment")
	public void setUpEnvironment() {
		ChromeOptions options =  new ChromeOptions();
		options.addArguments("--incognito");
		options.addArguments("guest");
		driver  = new ChromeDriver(options);
		System.out.println("value of the driver in StepDefinition is "+ driver);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
	@Given("The user loads the url")
	public void loadUrl() {
		driver.get("http://leaftaps.com/opentaps/control/main");
	}
	@When("The user enters the username as DemoSalesManager")
	public void the_user_enters_the_username_as_demo_sales_manager() {
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
	}

	@When("The user enters the password as crmsfa")
	public void the_user_enters_the_password_as_crmsfa() {
		driver.findElement(By.id("password")).sendKeys("crmsfa");
	}

	@When("The user clicks the login button")
	public void the_user_clicks_the_login_button() {
		driver.findElement(By.className("decorativeSubmit")).click();
	}

	@Then("The user should be redirected to the welcome page")
	public void the_user_should_be_redirected_to_the_welcome_page() {
		String welcomePageTitle = driver.getTitle();
		if (welcomePageTitle.contains("Automation")) {
			System.out.println("Title is verified");
		}
		else {
			System.out.println("Title is undefined");
		}	   
	}

}
