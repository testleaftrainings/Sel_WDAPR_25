package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class LearnBasicLocator {

	public static void main(String[] args) {
		//STEP NO 1 : INITIALIZE THE BROWSER DRIVER
		EdgeDriver driver = new EdgeDriver();
		//STEP NO 2 : MAXIMIZE
		driver.manage().window().maximize();
		//STEP NO 3 : Load my url
		//driver.get(null);
		driver.navigate().to("http://leaftaps.com/opentaps/control/login");
		//STEP NO 4 : How to locate a webelement
		//Mechanism used to locate elements within a document
		//Use this method to simulate typing into an element
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		//STEP NO 5 : Enter the password
		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		//STEP NO 6 : click the login
		driver.findElement(By.className("decorativeSubmit")).click();
		//STEP NO 7 : click the CRM/SFA
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		//STEP NO 8 : get the title of the page
		//Get the title of the current page.
		String pageTitle = driver.getTitle();
		System.out.println(pageTitle);
		//STEP NO 9: TO close the browser Window
		driver.close();	
	}

}
