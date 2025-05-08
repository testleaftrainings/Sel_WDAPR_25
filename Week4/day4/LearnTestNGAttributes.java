package week4.day4;

import org.testng.annotations.Test;

public class LearnTestNGAttributes {
@Test(priority = 1,invocationCount = 5)
	public void runCreatLead() throws InterruptedException {
		Thread.sleep(2000);
		System.out.println("TEST NO 1: unique Lead id is generated");
	}
@Test(priority = 2,enabled = true)
	public void runEditLead() {
		System.out.println("TEST NO 2");
	}
@Test(priority = 3)
	public void runAssertLead() {
		System.out.println("TEST NO 3");
	}
@Test(priority = 4)
public void runDeleteLead() {
	System.out.println("TEST NO 4");
}

}
