package week3.day2;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class LearnSet {

	public static void main(String[] args) {
	System.out.println("******HashSet****");
    Set<String> mentors= new HashSet<String>();
    mentors.add("Vinoth"); 
	mentors.add("Udhaya");
	mentors.add("Vineeth");
	mentors.add("Anburaj");
	mentors.add("Harrish");
	mentors.add("Vineeth");
	System.out.println("Size of the HashSet : "+ mentors.size());
	mentors.forEach(System.out::println);
	System.out.println("*****TreeSet *****");
	Set<String> mentors2= new TreeSet<String>();
	mentors2.add("anburaj");
	mentors2.add("Vinoth"); 
	mentors2.add("Udhaya");
	mentors2.add("Vineeth");
	mentors2.add("anburaj");
	mentors2.add("Harrish");
	System.out.println("Size of the TreeSet : "+ mentors2.size());
	mentors2.remove("Vineeth");
	mentors2.forEach(System.out::println);
	}

}
