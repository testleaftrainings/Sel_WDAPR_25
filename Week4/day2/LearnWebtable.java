package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWebtable {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.navigate().to("https://leafground.com/table.xhtml");
		int sizeOfTheRow = driver.findElements(By.xpath("//div[@class='ui-datatable-scrollable-body']//tbody/tr")).size();
		System.out.println("The total number of rows present inside the web table : "+ sizeOfTheRow);
		int sizeOfTheColumn = driver.findElements(By.xpath("//div[@class='ui-datatable-scrollable-body']//tbody/tr[1]/td")).size();
		System.out.println("The total number of columns present inside the web table : "+ sizeOfTheColumn);
		for (int i = 1; i <= sizeOfTheRow; i++) {//outer loop for represents the row from the webtable
			for (int j = 1; j <= sizeOfTheColumn; j++) {//inner loop for represents the column from the webtable
				String data = driver.findElement(By.xpath("//div[@class='ui-datatable-scrollable-body']//tbody/tr["+i+"]/td["+j+"]")).getText();
				System.out.print("| "+data+" |");
			}
			System.out.println();
		}
	}

}
