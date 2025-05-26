package week7.day1;

public class LearnFinally {

	public static void main(String[] args) {
		try {
			int[] arr=new int[-2];
			System.out.println(arr[2]);
		} 
		
		catch (ArrayIndexOutOfBoundsException e) {
		System.out.println("The exception is "+e);
		}
		
		
		finally {
		System.out.println("Exection status of the program");
		}
		

	}

}
