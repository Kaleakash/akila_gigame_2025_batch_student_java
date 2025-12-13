package com.extendsthread;
class A extends Thread {
    @Override
    public void run() {
        for(int i=0;i<5;i++){
            System.out.println("i="+i);
        }
    }
}
class B extends Thread {
    @Override
    public void run() {
        for(int j=0;j<5;j++){
            System.out.println("j="+j);
        }
    }
}
public class ExtendsThreadExample {
    public static void main(String[] args) {
        A obj1 = new A();
        B obj2 = new B();
        obj1.start();   // it call run method of thread class. run method of
        obj2.start();   // thread class contains empty body
    }
}
