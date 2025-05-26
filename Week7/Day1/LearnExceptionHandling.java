package week7.day1;

public class LearnExceptionHandling {

	public static void main(String[] args) {
		
		int number=7;
		
	try {
		System.out.println(number/0);
	}
		catch(ArithmeticException e) {
			System.out.println("The exception is: "+e);
		}
	
	try {
		int[] arr=new int[-2];
		System.out.println(arr[2]);
	} 
	catch (ArrayIndexOutOfBoundsException e) {
	System.out.println("The exception is "+e);
	}
	catch(Exception e)	{
		System.out.println("The Exception is: "+e);
	}
		
  System.out.println("Code completed");
		
	}

}
