package week3.day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnSweetAlert {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.navigate().to("https://leafground.com/alert.xhtml");
		driver.findElement(By.xpath("(//span[text()='Show'])[3]")).click();
		// sweet Alert
		driver.findElement(By.xpath("//span[text()='Dialog']/following-sibling::a")).click();


	}

}
