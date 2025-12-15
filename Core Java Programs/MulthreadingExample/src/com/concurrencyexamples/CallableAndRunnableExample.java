package com.concurrencyexamples;

import java.util.concurrent.*;

class Task1 implements  Runnable{
    @Override
    public void run() {
        try {
            System.out.println("Runnable thread");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
class Task2 implements Callable<Thread> {
    @Override
    public Thread call() throws Exception {
     Thread t = Thread.currentThread();
     System.out.println("callable thread ");
     return t;
    }
}
public class CallableAndRunnableExample {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        Runnable tt  = new Task1();
        Thread tt1 = new Thread(tt);
        tt1.start();
        Callable<Thread> cc = new Task2();
        //Thread tt2 = new Thread(cc);

        ExecutorService exec = Executors.newSingleThreadExecutor();
        exec.submit(tt);        // run method, no return
        Future<Thread> ff = exec.submit(cc);        // call method, no return
        System.out.println("in main "+ff.get());
        exec.shutdown();
    }
}
