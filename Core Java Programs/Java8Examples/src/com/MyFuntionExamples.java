package com;

import java.util.function.Function;

class MyFunction implements Function<Integer, String>{
	@Override
	public String apply(Integer t) {
		// TODO Auto-generated method stub
		return "You Pass the number as "+t;
	}
}
public class MyFuntionExamples {

	public static void main(String[] args) {
//		Function<Integer,String> fun1 = new MyFunction();
//		System.out.println(fun1.apply(10));
//		System.out.println("using the lambda");
//		
//		Function<Integer, String> fun2 = (Integer a)->"You pass the value as "+a;
//		System.out.println(fun2.apply(200));
//		Function<Integer, Integer> hike = (Integer s)->s+500;
//		System.out.println(hike.apply(5000));
//		
//		Function<String,String> stringRef = s->"Welcome user "+s.toUpperCase();
//		System.out.println(stringRef.apply("Raj"));
		
		Function<Integer, Integer> bonus = s ->s+5000;
		Function<Integer, Integer> tax = s->s-1500;
		Function<Integer, Integer> finalSalary = bonus.andThen(tax);
		
		System.out.println(finalSalary.apply(15000));
	}

}
