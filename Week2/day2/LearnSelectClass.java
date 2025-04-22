package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LearnSelectClass {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://leafground.com/select.xhtml");
		WebElement selectDropDown = driver.findElement(By.className("ui-selectonemenu"));
		//Step no 1: create a object for the select class , and pass parameter as selectDropDown
		Select options = new Select(selectDropDown);
		options.selectByIndex(4);
		Thread.sleep(1000);
		options.selectByVisibleText("Playwright");
		Thread.sleep(3000);
		driver.close();
	}

}
