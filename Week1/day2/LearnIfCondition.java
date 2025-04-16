package week1.day2;

public class LearnIfCondition {

	public static void main(String[] args) {

     boolean isPrimeUser= false;
     // (condition expression) 
     if (isPrimeUser) {
		// body is executed
    	 System.out.println("Movie will start to play");
	}
     else {
		System.out.println("Please subscribe to the prime");
	}
     
     int a=10;
     int b =3;
     if (a==b) {
    	 //false
    	 System.out.println("a value is equal to b");
	} else if (a>b) {
		//true
		System.out.println("a value is greater than the b value");
	} else if (a<b) {
		System.out.println("a value is lesser than the b value");
	}
    else {
		System.out.println("a value is  not equal to b");
	}

	}

}
