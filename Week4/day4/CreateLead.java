package week4.day4;



import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class CreateLead extends ProjectSpecificMethod {
	
	@Test
	public  void runCreateLead() {
		System.out.println("value of the driver for the create lead : "+ driver);
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("bhuvanesh");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("moorthy");
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("98127");
		driver.findElement(By.name("submitButton")).click();
		String text = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		if (text.contains("Testleaf")) {
			System.out.println("Lead created successfully");
		}
		else {
			System.out.println("Lead is not created");		
			
		}	
	}
}
