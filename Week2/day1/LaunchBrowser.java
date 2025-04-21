package week2.day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {

	public static void main(String[] args) {
		//A WebDriver implementation that controls a Chrome browser running on the local machine.
		//declaration
		ChromeDriver driver ;
		// initialize
		//step 1--> the browser is opened
		driver=new ChromeDriver();
		//step 2--> url is loaded
		driver.get("https://www.google.com/");
		//step 3--> window is maximized
		driver.manage().window().maximize();
		//step 4--> browser is closed
		//Close the current window, quitting the browser if it's the last window currently open. 
		driver.close();
	}

}
