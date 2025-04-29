package week3.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LearnList {

	public static void main(String[] args) {

		List<String> mentorList = new ArrayList<String>();
		mentorList.add("Vinoth"); 
		mentorList.add("Udhaya");
		mentorList.add("Vineeth");
		mentorList.add("Anburaj");
		mentorList.add("Harrish");
		mentorList.add("Vinoth");
		Collections.sort(mentorList);
		for (String name : mentorList) {
			System.out.println(name);
		}
		System.out.println(mentorList.size());
		String gettingNameFromTheList = mentorList.get(3); //index -0
		System.out.println(gettingNameFromTheList);
		String removedName = mentorList.remove(0);// INDEX WAY OF REMOVING THE value
		System.out.println("REMOVED THE VALUE FORM THE LIST : "+removedName);
		System.out.println("****AFTER REMOVING THE VALUE FORM THE LIST");
		
		for (String name : mentorList) {
			System.out.println(name);
		}
		boolean removeValue = mentorList.remove("Vineeth");// Object WAY OF REMOVING THE value
		System.out.println(removeValue);
		System.out.println("****Default mentor list *******");
		mentorList.forEach(System.out::println);
		///////////////////////////////
		List<String> mentorList1 = new ArrayList<String>();
		mentorList1.add("Vinoth"); 
		mentorList1.add("Udhaya");
		mentorList1.add("Vineeth");
		mentorList1.add("Anburaj");
		mentorList1.add("Harrish");
		
		mentorList1.removeAll(mentorList);
		System.out.println("****Remove All*****");
		//	Removes from this list (Duplicated mentor list) all of its elements 
		//  that are contained in the specified collection(Default mentor list).
		System.out.println("****Duplicated mentor list *******");
		mentorList1.forEach(System.out::println);
		mentorList1.clear();
		System.out.println("Duplicated mentor list size : "+mentorList1.size());
		System.out.println("**** converting the array into list  *******");
		List<String> asList = Arrays.asList("muthu","mukesh","kathir","ajay");
		asList.forEach(System.out::println);
		boolean contains = asList.contains("Muthu");
		System.out.println("verifying the value is present inside the list : "+contains);
	}

}
