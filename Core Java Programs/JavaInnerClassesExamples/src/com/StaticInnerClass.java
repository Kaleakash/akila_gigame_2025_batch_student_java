package com;

import com.Bank.AccountValidator;

class Bank {
	String bname="HSBC";
	static int accno=100;
	// only one copy doesn't mattern number of object created of Bank class. 
	static class AccountValidator {
		static void dis1() {
			System.out.println("Validating account details "+accno);
			//System.out.println("Bank name "+bname);
		}
		void dis2() {
			System.out.println("Non static method part of static inner class");
			Bank bb = new Bank();
			System.out.println(""+bb.bname);
		}
	}
}
public class StaticInnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank.AccountValidator.dis1();
		Bank.AccountValidator av = new Bank.AccountValidator();
		av.dis2();
	}

}
