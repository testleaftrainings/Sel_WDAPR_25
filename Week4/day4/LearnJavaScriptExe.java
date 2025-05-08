package week4.day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LearnJavaScriptExe {

	public static void main(String[] args) {
		ChromeOptions options =  new ChromeOptions();
		options.addArguments("--incognito");
		options.addArguments("guest");
		ChromeDriver driver  = new ChromeDriver(options);
		System.out.println("value of the driver : "+driver);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		WebElement loginButton = driver.findElement(By.className("decorativeSubmit"));
		driver.executeScript("arguments[0].click()", loginButton);
		driver.executeScript("window.scrollBy(0,2000);");
		driver.executeScript("location.reload();");
	}

}
