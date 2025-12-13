package com.implementsrunnable;
class A implements Runnable {
    @Override
    public void run() {
        for(int i=0;i<5;i++){
            System.out.println("i="+i);
        }
    }
}
class B implements Runnable {
    @Override
    public void run() {
        for(int i=0;i<5;i++){
            System.out.println("i="+i);
        }
    }
}
public class ImplementsExample {
    public static void main(String[] args) {
        Runnable obj1 = new A();
        Runnable obj2 = new B();
        Thread thread1 = new Thread(obj1);
        Thread thread2 = new Thread(obj2);
        thread1.start();
        thread2.start();
    }
}
