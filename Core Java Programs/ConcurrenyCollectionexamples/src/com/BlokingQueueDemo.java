package com;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.random.RandomGenerator;

class OrderProducer extends Thread {
    ArrayBlockingQueue<String> queue;
    OrderProducer(ArrayBlockingQueue<String> queue) {
        this.queue = queue;
    }
    @Override
    public void run() {
        try {
            queue.put("Order-101");
            System.out.println("Order produced");
        }catch (InterruptedException e){}
    }
}
class OrderConsumer extends Thread {
    ArrayBlockingQueue<String> queue;
    OrderConsumer(ArrayBlockingQueue<String> queue) {
        this.queue = queue;
    }
    @Override
    public void run() {
        try {
        String order   = queue.take();
        System.out.println("Order consumed: " + order);
        }catch (InterruptedException e){}
    }
}
public class BlokingQueueDemo {
    public static void main(String[] args) {
        System.out.println("Hello World");
        ArrayBlockingQueue<String> queue = new ArrayBlockingQueue<>(1);
        for(int i=1;i<5;i++) {
            new OrderProducer(queue).start();
            new OrderConsumer(queue).start();
        }
    }
}
