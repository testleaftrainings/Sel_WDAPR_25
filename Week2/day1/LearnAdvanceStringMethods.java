package week2.day1;

public class LearnAdvanceStringMethods {

	public static void main(String[] args) {
		String sentenceOne="Testleaf is your Automation Partner";
		//Splits this string around matches of the given regular expression.
		String[] splitingSentenceOne = sentenceOne.split("\\s");
		for (String delimiter: splitingSentenceOne) {
			System.out.println(delimiter);
		}
		System.out.println("**************************");
		String substring = sentenceOne.substring(5, 10);
		System.out.println(substring);
		System.out.println("**************************");
		//Returns a string resulting from replacing all occurrences of oldChar in this string with newChar
		 							  //oldChar,//newChar
		String replace = sentenceOne.replace(" ", "@");
		System.out.println(replace);
		System.out.println("************immutable**************");
		System.out.println(sentenceOne);
		System.out.println("************replaceAll**************");
		String sentenceTwo="testleaf, 600100 @ CHENNAI";
		String replaceAll = sentenceTwo.replaceAll("[0-9]", "");
		System.out.println(replaceAll);
	}

}
