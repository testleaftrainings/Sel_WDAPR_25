package week3.day3;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnAlert {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.navigate().to("https://leafground.com/alert.xhtml");
		// Simple Dialog/Alert
		driver.findElement(By.xpath("//span[text()='Show']")).click();
		//driver.switchTo().alert().accept()
		Alert alert = driver.switchTo().alert();
		alert.accept();
		// Confirm Dialog/Alert
		driver.findElement(By.xpath("(//span[text()='Show'])[2]")).click();
		alert.dismiss();
		// Prompt Dialog/Alert
		driver.findElement(By.xpath("//h5[contains(text(),'Prompt Dialog')]/following-sibling::button")).click();
		String textFromPrompt= alert.getText();
		System.out.println(textFromPrompt);
		alert.sendKeys("Bhuvanesh");
		alert.accept();
		String verifyTheName = driver.findElement(By.id("confirm_result")).getText();
		System.out.println(verifyTheName);
		Thread.sleep(3000);
		driver.close();
		}
}
