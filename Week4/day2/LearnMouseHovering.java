package week4.day2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class LearnMouseHovering {
	public static void main(String[] args) throws IOException {
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--incognito");
		option.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.navigate().to("https://www.myntra.com/");
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("//a[text()='Men']")))
		.pause(2000)
		.click(driver.findElement(By.xpath("//a[text()='T-Shirts']")))
		.perform();
		act.scrollToElement(driver.findElement(By.xpath("//a[text()=' Contact Us ']"))).perform();
		// step 1 : we have to choose our file type
		File source = driver.getScreenshotAs(OutputType.FILE);
		// step 2 : we have to create a folder 
		// File class-- .name of the folder/name of the snapshot .image format
		File Target = new File("./snap/myntra.png");
		//step 3 : we are merging the source file with the destination file using the Apache.commons.io
		FileUtils.copyFile(source, Target);
	}
}
