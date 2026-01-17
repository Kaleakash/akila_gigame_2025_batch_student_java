package com;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class MyPredicates {

	public static void main(String[] args) {
		
		Predicate<Integer> ageEligible = (age)->age>18;
		System.out.println(ageEligible.test(17));
		System.out.println(ageEligible.test(21));
		
		BiPredicate<String, String> logging = (emailid,password)->emailid.equals("admin@gmail.com") && password.equals("admin@123");
		System.out.println(logging.test("admin@gmail.com", "admin@123"));
		System.out.println(logging.test("admin@gmail.com", "admin@1235"));
	}

}
