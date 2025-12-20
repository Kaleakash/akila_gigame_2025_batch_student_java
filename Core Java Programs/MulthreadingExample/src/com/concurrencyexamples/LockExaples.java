package com.concurrencyexamples;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class TicketTask implements Runnable {
    int ticket = 2;
    Lock ll = new ReentrantLock();
    @Override
    public void run() {
        Thread t = Thread.currentThread();
        String name = t.getName();
        ll.lock();
        try{
            if(ticket>0){
                System.out.println(name + " booked the ticket");
                ticket= ticket - 1;
            }else {
                System.out.println(name + " not booked the ticket");
            }

        }catch(Exception e){

        }finally {
            ll.unlock();
        }
    }
}
public class LockExaples {
    public static void main(String[] args) {
        TicketTask task = new TicketTask();
        Thread t1 = new Thread(task,"Raj");
        Thread t2 = new Thread(task,"Ravi");
        Thread t3 = new Thread(task,"Ramesh");
        t1.start();
        t2.start();
        t3.start();
    }
}
