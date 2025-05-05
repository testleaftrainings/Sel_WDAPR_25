package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWindowHandles {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://leafground.com/window.xhtml");
		String parentWindowAddress = driver.getWindowHandle();
		System.out.println("parent Window Address :"+parentWindowAddress);
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//span[text()='Open']")).click();
		//1)Retrieve the set of window handles using driver.getWindowHandles().
		Set<String> allWindowAddress = driver.getWindowHandles();//size --> 2
		//2)Convert the set to a list to handle windows in a sequential manner.
		System.out.println("Address of all opened Windows");
		List<String> allWindowsList = new ArrayList<String>(allWindowAddress);
		allWindowsList.forEach(System.out::println);
		//3)Use the driver.switchTo().window(windowHandle) to switch control to the desired window.
		String childWindowAddress = allWindowsList.get(1);
		System.out.println("child Window Address :"+childWindowAddress);
		driver.switchTo().window(childWindowAddress);
		String childWindowTitle = driver.getTitle();
		System.out.println("child Window Title :"+childWindowTitle);
		driver.close();
		//4) driver focus back to parent window
		driver.switchTo().window(parentWindowAddress);
		System.out.println(driver.getTitle());
		// If we want to close the browser or all the windows at once 
		driver.quit();
	}
}
