package week3.day2;

public class LearnStaticMembers {

	static String browser;
	int b;
	{
		System.out.println("Non static Block");
	}

	public static void readValue() {
		System.out.println("static method");
		System.out.println("The choosen browser is " + browser);
	}

	public void read() {
		System.out.println("Non static method :" + browser);
	}

	static {
		browser = "Chrome";
		System.out.println("Static Block got executed Here as the First");
	}
	

	public static void main(String[] args) {
		System.out.println(browser);
		readValue();
		LearnStaticMembers lsm = new LearnStaticMembers();
		lsm.read();
		
	}

}
