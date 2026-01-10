package com;
class Outer1 {
	int a;
	void dis1() {
		System.out.println("dis1 method");
	}
	// non static or instance complex property 
	class Inner1 {
		void dis2() {
			System.out.println("non static inner class");
		}
	}
}
public class NonStaticInnerClass {

	public static void main(String[] args) {
	Outer1 out1 = new Outer1();
	out1.dis1();
	Outer1.Inner1 in1 = new Outer1().new Inner1();
	in1.dis2();
	Outer1.Inner1 in2 = out1.new Inner1();
	in2.dis2();
	}

}
