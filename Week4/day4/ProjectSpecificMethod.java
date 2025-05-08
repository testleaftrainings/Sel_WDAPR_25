package week4.day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class ProjectSpecificMethod {
	
	ChromeDriver driver; // memory no assigned/initialized
	@BeforeMethod
	public void preCondition() {
		ChromeOptions options =  new ChromeOptions();
		options.addArguments("--incognito");
		options.addArguments("guest");
		driver  = new ChromeDriver(options);
		System.out.println("value of the driver : "+driver);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit"));
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();

	}
	@AfterMethod
	public void postCondition() {
		driver.close();
	}

}
