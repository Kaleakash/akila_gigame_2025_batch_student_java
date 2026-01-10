package com;
@FunctionalInterface
interface Abc {
	public void dis1();
	public default void dis2() {
		System.out.println("Abc dis2 default method");
	}
	default void dis3() {
		System.out.println("Abc dis3 default method");
	}
	static void dis4() {
		System.out.println("Abc dis4 static method");
	}
	
}
interface Xyz {
	void dis1();
	default void dis2() {
		System.out.println("Xyz dis2 default method");
	}
	default void dis3() {
		System.out.println("Xyz dis3 default method");
	}
	static void dis4() {
		System.out.println("Xyz dis4 static method");
	}
}
class Test implements Abc,Xyz{
	@Override
	public void dis1() {
		System.out.println("dis1 override for Abc and Xyz");
	}
	@Override
	public void dis2() {
		System.out.println("dis2 default override by Test class");
	}
	@Override
	public void dis3() {
		System.out.println("dis2 default override by Test class");
	}
}

public class Java8InterfaceExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test tt = new Test();
		tt.dis1();
		tt.dis2();
		tt.dis3();
		Abc.dis4();
		Xyz.dis4();
	}

}
