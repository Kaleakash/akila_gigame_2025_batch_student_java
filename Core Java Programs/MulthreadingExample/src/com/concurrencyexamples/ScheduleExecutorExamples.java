package com.concurrencyexamples;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

class SessionCleanUpTask implements Runnable{
    @Override
    public void run() {
        System.out.println("Cleaning up the session");
    }
}

public class ScheduleExecutorExamples {
    public static void main(String[] args) {
        //ExecutorService executorService = Executors.
        //executorService.submit(new SessionCleanUpTask());
        ScheduledExecutorService ex = Executors.newScheduledThreadPool(1);
        ex.scheduleAtFixedRate(new SessionCleanUpTask(),2,5, TimeUnit.SECONDS);
    }
}
