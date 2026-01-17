package com;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamWithPrimitiveArray {

	public static void main(String[] args) {
		int num[] = {1,2,3,4,5,6,7,8,9,10};
//		IntStream intStream= Arrays.stream(num);
//		intStream.forEach(v->System.out.println(v));
//		intStream.forEach(v->System.out.println(v));
		
		//Arrays.stream(num).forEach(v->System.out.println("Value is "+v));
		//Arrays.stream(num).mapToLong(m->m*m).forEach(v->System.out.println(v));
//		Arrays.stream(num).filter(v->v%2==0).forEach(v->System.out.println(v));
//		Arrays.stream(num).filter(v->v%2!=0).forEach(v->System.out.println(v));
//		Arrays.stream(num).filter(v->v%2!=0).map(v->v+100);
//		boolean result1 = Arrays.stream(num).anyMatch(v->v>10);
//		System.out.println(result1);
//		boolean result2 = Arrays.stream(num).anyMatch(v->v>=10);
//		System.out.println(result2);
//		boolean result3 = Arrays.stream(num).allMatch(v->v>0);
//		System.out.println(result3);
		for(int n:num) {
			if(n%2==0) {
			System.out.println(n);
			}
		}
	}

}
