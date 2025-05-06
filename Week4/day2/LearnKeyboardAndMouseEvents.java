package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnKeyboardAndMouseEvents {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.navigate().to("https://www.leafground.com/drag.xhtml");
		Actions act = new Actions(driver);
		// Keyboard events
		act.sendKeys(driver.findElement(By.xpath("//input[@placeholder='Search...']")),"Drag And Drop")
		.pause(2000)
		.keyDown(Keys.SHIFT).keyDown(Keys.HOME)
		.keyUp(Keys.HOME).keyUp(Keys.SHIFT)
		.pause(2000)
		.sendKeys(Keys.TAB).build().perform();	
		// Mouse events
		//Drag and drop using the pixel
		act.clickAndHold(driver.findElement(By.id("form:conpnl")))
		.moveByOffset(400, 0)
		.release()
		.perform();
		// Drag and drop using the targeted web element 
		act.dragAndDrop(driver.findElement(By.id("form:drag_content")),driver.findElement(By.id("form:drop"))).perform();
	}
}
