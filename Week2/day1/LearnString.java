package week2.day1;

public class LearnString {

	public static void main(String[] args) {
      // way no 1 : literal
		String nameOne="Testleaf";
		// way no 2 : instance
		String nameTwo= new String("tetleaf");
		String nameThree="Testleaf";
		String nameFour= new String("Testleaf");
		// checking the values within the variable is same or not 
		System.out.println(nameThree==nameOne);// what will be output: true or false
		System.out.println(nameFour==nameTwo);// what will be output: true or false
		System.out.println("*******************************************");
		System.out.println(System.identityHashCode(nameOne)+" USING literal-1 way");
		System.out.println(System.identityHashCode(nameTwo)+" USING instance way");
		System.out.println(System.identityHashCode(nameThree)+" USING literal-2 way");
		if (nameTwo.contains("Leaf")) {
			System.out.println("the value is same");
		}
		else {
			System.out.println("the value is not same");
		}
		System.out.println("********************************************");
		int length = nameTwo.length();// press ctrl+2 keys altogether, then after while Press key "L"
		System.out.println(length);
		int length2 = nameThree.length();
		System.out.println(length2);
		System.out.println("*********************charArray***********************");
		// Converts this string to a new character array
		char[] charArray = nameThree.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			System.out.println(charArray[i]);
		}
		System.out.println("*********************charAt***********************");
		//Returns the char value at the specified index
		for (int i = 0; i < nameThree.length(); i++) {
			System.out.println(nameThree.charAt(i));
		}
		System.out.println("*********************reverse the string***********************");
		//Returns the char value at the specified index
		// length - > 8 -1-->7
		// i =7; 7>=0;7--
		for (int i = nameThree.length()-1; i >= 0; i--) {
			System.out.println(nameThree.charAt(i));
		}
	}

}
