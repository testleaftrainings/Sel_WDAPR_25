package week3.day1;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnCollections {

	public static void main(String[] args) {
     ChromeDriver driver = new ChromeDriver();
     driver.manage().window().maximize();
     driver.get("https://en-gb.facebook.com/login.php");
     List<WebElement> groupOfTextFromFB = driver.findElements(By.tagName("a"));
     int size = groupOfTextFromFB.size();
     System.out.println(size);
     for (WebElement singleWebelement : groupOfTextFromFB) {
    	 System.out.println(singleWebelement.getText());
	} 
     // syntax : interface<genericType> nameOfTheList = new ImplemenationClass<>();
     List<String> mentorList = new ArrayList<String>();
     mentorList.add("Anburaj");
     mentorList.add("Harrish");
     mentorList.add("Mukesh");
     mentorList.add("Mukesh");
     
     System.out.println(mentorList);
     
     
     
     
     
	}

}
