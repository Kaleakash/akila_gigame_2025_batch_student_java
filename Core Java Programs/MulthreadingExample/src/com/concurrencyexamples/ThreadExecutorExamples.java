package com.concurrencyexamples;

import java.util.concurrent.*;

class Task3 implements Callable<Thread> {
    @Override
    public Thread call() throws Exception {
        Thread t = Thread.currentThread();
        System.out.println("payment task");
        return t;
    }
}
class Task4 implements Callable<Thread> {
    @Override
    public Thread call() throws Exception {
        Thread t = Thread.currentThread();
        System.out.println("printing task");
        return t;
    }
}
public class ThreadExecutorExamples {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
       Callable<Thread> tt1  = new Task3();
        Callable<Thread> tt2  = new Task4();
       // ExecutorService executor = Executors.newSingleThreadExecutor();  // 1 thread 5 work
       //ExecutorService executor = Executors.newFixedThreadPool(2); // 2 thread divided 5
        //ExecutorService executor = Executors.newCachedThreadPool();
        ExecutorService executor = Executors.newScheduledThreadPool(2);
        for(int i=0;i<5;i++) {
            Future<Thread> ff = executor.submit(tt1);
            System.out.println(ff.get());
            
                if(ff.isDone()){

                    Future<Thread> ff1 = executor.submit(tt2);
                    System.out.println(ff1.get());
                }
        }
        executor.shutdown();
    }
}
