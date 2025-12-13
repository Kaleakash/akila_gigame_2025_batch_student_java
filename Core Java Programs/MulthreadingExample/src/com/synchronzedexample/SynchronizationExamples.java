package com.synchronzedexample;
class BookingApp implements Runnable {
    int avl = 2;
    @Override
    public void run() {
        Thread t = Thread.currentThread();
        String name = t.getName();

        System.out.println(name+" ready to book the ticket");

        synchronized (this) {
            if (avl > 0) {
                System.out.println(name + " got the ticket");
                avl = avl - 1;
            } else {
                System.out.println(name + " sorry no ticket");
            }
        }

        System.out.println(name + " book the ticket, may be successfully or failure");
    }
}
public class SynchronizationExamples {
    public static void main(String[] args) {
        BookingApp b1 = new BookingApp();   // avl = 3
        //BookingApp b2 = new BookingApp();   // avl=3
        //BookingApp b3 = new BookingApp();   // avl=3
        //BookingApp b4 = new BookingApp();   // avl = 3
        Thread t1 = new Thread(b1,"Raj");
        Thread t2 = new Thread(b1,"Ravi");
        Thread t3 = new Thread(b1,"Ram");
        Thread t4 = new Thread(b1,"Raju");
        t4.setPriority(Thread.MAX_PRIORITY); //10
        t1.setPriority(Thread.MIN_PRIORITY);  //1
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
