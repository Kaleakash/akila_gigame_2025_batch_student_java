package com;
interface Hello {
	void dis();
}
class HelloImp implements Hello {
	@Override
	public void dis() {
	System.out.println("Hello interface implementation");	
	}
}
public class AnonymousClassExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1st approach
		Hello h1 = new HelloImp();
		h1.dis();
		// 2nd approach 
		Hello h2 = new Hello() {
			@Override
			public void dis() {
				System.out.println("Hello interface implementation - first way annomous class");	
			}
		};
		h2.dis();
		Hello h3 = new Hello() {
			@Override
			public void dis() {
				System.out.println("Hello interface implementation - second way annomous class");	
			}
		};
		h3.dis();
		// 3rd approach 
		Hello h4 = ()->System.out.println("providing body for dis method using lambda style");
		h4.dis();
	}

}
