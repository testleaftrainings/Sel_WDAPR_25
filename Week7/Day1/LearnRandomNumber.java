package week7.day1;

public class LearnRandomNumber {

	public static void main(String[] args) {
		//double randomNumber = Math.random();
		//System.out.println(randomNumber);

		int randomNumber=(int)(Math.random()*9999999+999999);
		System.out.println(randomNumber);
	}
}