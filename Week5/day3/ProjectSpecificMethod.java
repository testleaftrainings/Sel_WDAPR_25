package week5.day3;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

public class ProjectSpecificMethod {
	public RemoteWebDriver driver;
	//step 2.: into the BaseClass or PSM  and declare a fileName globally
	public String fileName;
	@Parameters({ "user", "pass", "url", "browser"})
	@BeforeMethod
	public void preCondition(String userName, String passWord, String link, String browserType)
			throws InterruptedException {
		System.out.println("The data which is passed via Xml File ----> " + link + " : " + userName + " : " + passWord
				+ " : " + browserType);
		switch (browserType.toLowerCase()) {
		case "edge":
			driver = new EdgeDriver();
			break;
		case "firefox":
			driver = new FirefoxDriver();
			break;

		default:
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--incognito");
			options.addArguments("guest");
			driver = new ChromeDriver(options);
			break;
		}
		System.out.println("value of the driver : " + driver);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get(link);
		driver.findElement(By.id("username")).sendKeys(userName);
		driver.findElement(By.id("password")).sendKeys(passWord);
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
	}

	@AfterMethod
	public void postCondition() {
		driver.close();
	}
	//step 3: Move the sendData Method to the BaseClass or PSM 
	@DataProvider(name="fetchExcelData")
	public String[][] sendData() throws IOException {
		return DataLibrary.readValesFromExcel(fileName);
	}

}
