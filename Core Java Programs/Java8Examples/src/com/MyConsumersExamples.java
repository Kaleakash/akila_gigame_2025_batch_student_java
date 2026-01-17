package com;

import java.util.function.Consumer;

public class MyConsumersExamples {

	public static void main(String[] args) {
		Consumer<String> print = (s)->System.out.println("Value is "+s);
		print.accept("Raju");
		Consumer<String> c1 = (s)->System.out.println(s.toUpperCase());
		c1.accept("ram");
		Consumer<String> c2 = (s)->System.out.println(s.length());
		c2.accept("Raj Deep");
		Consumer<String> logger = msg ->System.out.println("LOG "+msg);
		logger.accept("Error");
	}

}
