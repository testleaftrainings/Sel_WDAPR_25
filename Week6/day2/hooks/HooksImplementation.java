package hooks;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import base.ProjectSpecificMethods;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class HooksImplementation extends ProjectSpecificMethods {
	@Before
	public void preConditions() {
		ChromeOptions options =  new ChromeOptions();
		options.addArguments("guest");
		driver  = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("http://leaftaps.com/opentaps/control/main");
	}
	@After
	public void postConditions() {
		driver.close();
	}

}
