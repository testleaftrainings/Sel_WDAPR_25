package week5.day2;



import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CreateLead extends ProjectSpecificMethod {
	@DataProvider(name="fetchExcelData")
	public String[][] sendData() throws IOException {
		return DataLibrary.readValesFromExcel();
	}
	
	@Test(dataProvider = "fetchExcelData")
	public  void runCreateLead(String cname,String fname,String lname,String phno) {
		System.out.println("value of the driver for the create lead : "+ driver);
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cname);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fname);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lname);
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys(phno);
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
