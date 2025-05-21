package base;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.cucumber.testng.AbstractTestNGCucumberTests;

public class ProjectSpecificMethods  extends AbstractTestNGCucumberTests{
	public  ChromeDriver driver; //declared the driver , value is null here
	@BeforeMethod
	public void preConditions() {
		ChromeOptions options =  new ChromeOptions();
		options.addArguments("guest");
		driver  = new ChromeDriver(options);
		System.out.println(driver);
		System.out.println("value of the driver in StepDefinition is "+ driver);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("http://leaftaps.com/opentaps/control/main");
	}
	@AfterMethod
	public void postConditions() {
		driver.close();
	}
}
