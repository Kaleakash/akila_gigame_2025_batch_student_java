package com;

import java.util.UUID;
import java.util.function.Supplier;

public class MySuppliers {

	public static void main(String[] args) {
		Supplier<Integer> random = ()->(int)(Math.random()*10000);
		System.out.println(random.get());
		
		Supplier<Long> time = ()->System.currentTimeMillis();
		System.out.println(time.get());
		
		Supplier<String> session = ()->UUID.randomUUID().toString();
		System.out.println(session.get());

	}

}
