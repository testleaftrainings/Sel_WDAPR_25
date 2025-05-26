package week7.day1;

public class LearnThrow {

	public static void main(String[] args) throws Exception {
		
		
		int age=18;
        if (age>=18) {
			System.out.println("Eligible for voting");
		}
		else {
			System.out.println("Not eligible for voting");
		}
		
		if(age<=0) {
			throw new Exception("Age is negative");
		}

		System.out.println("Code completed");
	}

}
