package week2.day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnImplicitlyWait {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		//NoSuchElementException
		driver.get("http://leaftaps.com/opentaps/control/main");
		String textOfTheElement = driver.findElement(By.xpath("//label[text()='Username']/following::label")).getText();
		System.out.println(textOfTheElement);
		String textOfTheElement2 = driver.findElement(By.xpath("//label[text()='Password']/preceding::label")).getText();
		System.out.println(textOfTheElement2);
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		Thread.sleep(1000);
		//STEP NO 5 : Enter the password
		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		Thread.sleep(1000);
		driver.close();

	}

}
