package week3.day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnFrame {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.navigate().to("https://leafground.com/frame.xhtml");
		//Click Me (Inside frame)
		driver.switchTo().frame(0);
		driver.findElement(By.id("Click")).click();
		String textOfInsideFrame = driver.findElement(By.id("Click")).getText();
		System.out.println(textOfInsideFrame);
		// shifing driver focus back to Root Html Document
		driver.switchTo().defaultContent();
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@src='nested.xhtml']")));
		String countFrames = driver.findElement(By.id("Click")).getText();
		System.out.println(countFrames);
		driver.switchTo().defaultContent();
		driver.switchTo().frame(2);
		//Click Me (Inside Nested frame)
		driver.switchTo().frame("frame2");
		driver.findElement(By.id("Click")).click();
		String textFromNestedFrame = driver.findElement(By.id("Click")).getText();
		System.out.println(textFromNestedFrame);
		driver.switchTo().parentFrame();
		driver.switchTo().defaultContent();
		driver.close();
	}

}
