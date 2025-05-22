package week6.day4;

public class ChildClass {

	public static void main(String[] args) {
		LearnEncapsulation le = new LearnEncapsulation();
		le.setBrowserName("Chrome");
		System.out.println("Now the private member can be accessed outside the class also -->"+le.getBrowserName());

	}

}
