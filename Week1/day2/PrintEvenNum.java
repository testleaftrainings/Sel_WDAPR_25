package week1.day2;

public class PrintEvenNum {

	public static void main(String[] args) {

		int num = 11;
		// requirement 1: I want to check whether the value is odd or even
		
		if (num%2==0) {
			//5%2-->1
			
			System.out.println("the num is even"+num);
			
		}
		else {
			System.out.println("the num is odd"+num);
		}
		// requirement 2: I want to print the even number within the input range
		
		for (int i = 1; i <num ; i++) {
			if (i%2==0) {
				System.out.println("the even num is "+i);
			}
		}
		
		

	}

}
