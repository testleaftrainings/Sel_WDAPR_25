package week7.day2;

import com.github.javafaker.Faker;

public class LearnFakerClass {
/*
 * Provides utility methods for generating fake strings, such as names, phonenumbers, addresses.
 *  generate random strings with given patterns
 */
	public static void main(String[] args) {

		Faker faker = new Faker();
		//cname,fname,lname,phno
		String cname = faker.company().name();
		System.out.println(cname);
		String firstName = faker.name().firstName();
		System.out.println(firstName);
		String lastName = faker.name().lastName();
		System.out.println(lastName);
		String emailString= firstName+"."+lastName+"@gmail.com";
		System.out.println(emailString);
		System.out.println(faker.name().fullName());
		
		

	}

}
