package week4.day1;


import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LearnExplicitWait {
	public static void main(String[] args) throws IOException, InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://leafground.com/window.xhtml");
		Thread.sleep(3000);
		WebElement button = driver.findElement(By.xpath("//h5[text()='Wait for 2 new tabs to open']/following-sibling::button"));
		// step 1 : we have to choose our file type
		File source = driver.getScreenshotAs(OutputType.FILE);
		// step 2 : we have to create a folder 
		// File class-- .name of the folder/name of the snapshot .image format
		File Target = new File("./snap/openWithDelay.png");
		//step 3 : we are merging the source file with the destination file using the Apache.commons.io
		FileUtils.copyFile(source, Target);
		button.click();
		// step 1 : creating the object for webdriverwait;
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
		//TimeOutException
		// step 2 : within the Until() we have to set the condition
		Boolean verifyTheCondition = wait.until(ExpectedConditions.numberOfWindowsToBe(3));
		//driver.getWindowHandles().size() == expectedNumberOfWindows
		System.out.println(verifyTheCondition);
		System.out.println("verify The Condition :"+verifyTheCondition);
		if (verifyTheCondition==true) {
			driver.quit();
		}
	}
}
