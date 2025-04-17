package week1.day3;

import java.util.Arrays;

public class LearnArray {

	public static void main(String[] args) {
		int empNumber[] = { 2543, 9678, 4381, 6655, 3298 };
		// Length count starts from 1
		System.out.println("Length of the empNumber[] :" + empNumber.length);
		// index count starts from 0
		/*
		 * 2543 9678 4381 6655 3298
		 */
		Arrays.sort(empNumber);
		/*
		 * 2543 3298 4381 6655 9678
		 */
		System.out.println("to Print the second largest value for the array :" + empNumber[empNumber.length-2]);
		for (int i = empNumber.length-1; i>=0; i--) {
			System.out.println(empNumber[i]);
		}
		// instansiation way of initializing an array
		//type name[] = new type[size];
		String empName [] = new String[3];
		empName[0]="Bhuvanesh";
		empName[1]="Anburaj";
		empName[2]="Harrrish";
		empName[0]="Vineeth";
		for (int i = 0; i < empName.length; i++) {	
			///System.out.println("Employee Name :"+empName[i]);
			if (empName[i].equals("Vineeth")) {
				System.out.println("Loop is terminated/Skipped");	
				//continue;
				break;
			}	
			System.out.println("Employee Name :"+empName[i]);	
		}
	}

}
