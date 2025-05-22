package week6.day4;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class LearnExtentReport {
	public static void main(String[] args) {
	//Steps to Generate Extent Report
		//Step 1: Set Physical Report Path	
		ExtentHtmlReporter html = new ExtentHtmlReporter("./reports/result.html");
		//Step 2: Create ExtentReports Object
		ExtentReports extent = new ExtentReports();
		//Step 3: Attach Reporter to ExtentReports
		extent.attachReporter(html);
		//Step 4: Create a Test & Assign Details
		ExtentTest createTC = extent.createTest("CreateLead", "Attempting to create a new lead in the CRM application");
        //Assign Details
		createTC.assignAuthor("Bhuvanesh");
		createTC.assignCategory("Regression");
		//Step 5: Add Test Logs (Pass/Fail Status)
		createTC.pass("Username is entered successfully");
		createTC.pass("Password is entered successfully");
		createTC.pass("Login is Clicked successfully");
		createTC.fail("CRMSFA link in not Clicked");
		//Step 6: Flush the Report (Mandatory)
		extent.flush();
		System.out.println("The report is generated");
	}

}
