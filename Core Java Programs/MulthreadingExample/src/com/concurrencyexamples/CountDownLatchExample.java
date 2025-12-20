package com.concurrencyexamples;

import java.util.concurrent.CountDownLatch;

class StartUpTask implements Runnable{
    CountDownLatch latch;
    String service;
    StartUpTask(CountDownLatch latch,String service){
        this.latch=latch;
        this.service=service;
    }
    @Override
    public void run() {
        System.out.println("Starting "+service);
        try{
            //Thread.sleep(2000);
        }catch(Exception e){}
        latch.countDown();
    }
}
public class CountDownLatchExample {
    public static void main(String[] args) throws InterruptedException {
        CountDownLatch latch = new CountDownLatch(2);
        StartUpTask task1= new StartUpTask(latch,"Db Service");
        StartUpTask task2= new StartUpTask(latch,"Server Service");
        StartUpTask task3= new StartUpTask(latch,"Cache DB ");
        StartUpTask task4= new StartUpTask(latch,"My SQL DB");
        Thread thread1 = new Thread(task1);
        Thread thread2 = new Thread(task2);
        Thread thread3 = new Thread(task3);
        Thread thread4 = new Thread(task4);
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        latch.await();
        System.out.println("All Task done or started");
    }
}
