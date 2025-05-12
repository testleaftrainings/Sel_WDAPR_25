package week5.day1;



import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CreateLead extends ProjectSpecificMethod {
	//step 1 : create a method sendData() inside the CreateLead class
	//step 2 : Annotate that method with @DataProvider
	@DataProvider(name = "fetchData")
	public String[][] sendData() {
		//step no 3: Inside sendData() create 2-Dimensional array with number of rows and columns
							//[ rows ][columns]
		String [][]data= new String[2][4];
		////step no 4: Add all the sets of data into the array and make sure the index starts from 0
		// DATA SET NO 1
		data[0][0]="Testleaf";
		data[0][1]="Bhuvanesh";
		data[0][2]="M";
		data[0][3]="998877";
		// DATA SET NO 2
		data[1][0]="Qeagle";
		data[1][1]="Harrish";
		data[1][2]="A";
		data[1][3]="778899";
		//step no 5: Return the data back to the calling method
		return data;
	}
	//step no 6:Receive this data in the test method
	//use dataprovider attibute
	@Test(dataProvider = "fetchData")
	//use that arguments inside the method.
	public  void runCreateLead(String cname,String fname,String lname,String phno) {
		//step no 7:Finally, replace the hardcoded values
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
