package com.concurrencyexamples;

import java.util.concurrent.*;

class PaymentTask implements Callable<String>{
    @Override
    public String call() throws Exception {
        Thread.sleep(5000);
        return "Payment success";
    }
}

public class FututeTimeOutExamples {
    public static void main(String[] args) throws Exception {
        ExecutorService executors = Executors.newSingleThreadExecutor();
        Future<String> future = executors.submit(new PaymentTask());
        try{
            System.out.println(future.get(7, TimeUnit.SECONDS));
        }catch(Exception e){
            System.out.println(e);
        }
        executors.shutdown();
    }
}
