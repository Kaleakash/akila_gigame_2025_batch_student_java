package com.concurrencyexamples;

import java.util.concurrent.atomic.AtomicInteger;

class ApiHitCounter implements Runnable {
    //int count;
    AtomicInteger counter = new AtomicInteger(0);
    @Override
    public void run() {
        //count++;
       //System.out.println("Number client hit my app "+count);
        System.out.println("Number of client hit my app "+counter.incrementAndGet());
    }
}

public class AtomicVariable {
    public static void main(String[] args) {
        ApiHitCounter apiHitCounter = new ApiHitCounter();
        new Thread(apiHitCounter).start();
        new Thread(apiHitCounter).start();
        new Thread(apiHitCounter).start();
        new Thread(apiHitCounter).start();
    }
}
