package week2.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnXpath {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://leafground.com/checkbox.xhtml");
		WebElement basic = driver.findElement(By.xpath("//div[contains(@class,'ui-chkbox-box ui-widget')]"));
		
		if (basic.isEnabled()) {
			
			basic.click();
			Thread.sleep(1000);
			boolean selected = driver.findElement(By.xpath("(//span[text()='Basic']/preceding-sibling::div[2])/input")).isSelected();
			System.out.println("CHECK BOX IS SELECTED OR NOT : "+selected);
		}
		driver.findElement(By.xpath("(//div[contains(@class,'ui-chkbox-box ui-widget')])[5]")).click();
		WebElement checkingTheElementState = driver.findElement(By.xpath("(//span[text()='Disabled']/preceding-sibling::div[2])/input"));
		System.out.println("Verifying the elements State : "+ checkingTheElementState.isEnabled());

	}

}
