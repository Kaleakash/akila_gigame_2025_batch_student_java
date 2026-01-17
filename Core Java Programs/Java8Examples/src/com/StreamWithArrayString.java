package com;

import java.util.Arrays;

public class StreamWithArrayString {

	public static void main(String[] args) {
		String names[] = {"Ravi","Ravi","Ramesh","Lokesh","Ajay","Vikash"};
		Arrays.stream(names).forEach(v->System.out.print(v+" "));
		System.out.println("");
		Arrays.stream(names).map(name->name.toLowerCase()).forEach(v->System.out.print(v+" "));
		System.out.println("");
		Arrays.stream(names).filter(v->v.contains("e")) .forEach(v->System.out.print(v+" "));
		System.out.println("");
		Arrays.stream(names).filter(v->v.length()>5).forEach(v->System.out.print(v+" "));
		
		
	}

}
