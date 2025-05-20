package week6.day2;

public class LearnConstructor extends ParentClass {
	String a = "Qeagle";

	public LearnConstructor(String cname) {
		super(600097);// Must explicitly invoke another constructor
		System.out.println("Special Method - Child Class : " + cname);
	}

	public LearnConstructor(String cname, String location) {
		this("Leaftaps");// chaining one constructor from the another constructor
		System.out.println("Company Name  : " + cname);
		System.out.println("The " + cname + " is Located near " + location);
	}

	public void normalMethod() {
		String a;
		a = this.a;
		System.out.println("Normal Method : " + a);
	}

	public static void main(String[] args) {
		// ClassName ObjectName = new ClassName();
		// new LearnConstructor();
		LearnConstructor learn;
		learn = new LearnConstructor("Testleaf", "Chennai");
		learn.normalMethod();
	}

}
