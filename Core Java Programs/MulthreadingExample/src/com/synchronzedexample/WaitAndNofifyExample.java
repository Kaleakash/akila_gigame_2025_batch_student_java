package com.synchronzedexample;
class Task implements  Runnable{
    @Override
    public synchronized void run() {
        Thread t = Thread.currentThread();
        String name = t.getName();
                for(int i=0;i<10;i++){
                    try {
                        System.out.println(name+" "+i);
                        Thread.sleep(500);
                        if(i==4 & name.equals("Raj")){
                            wait();
                        }
                        if(i==6 & name.equals("Ram")){
                            //notify();
                            wait();
                        }
                        if(i==5 & name.equals("Ravi")){
                            //notify();
                            //wait();
                            notifyAll();
                        }
                    }catch(Exception e){

                    }
                }
    }
}
public class WaitAndNofifyExample {
    public static void main(String[] args) {
        Task tt = new Task();
        Thread t1 = new Thread(tt,"Raj");
        Thread t2 = new Thread(tt,"Ravi");
        Thread t3 = new Thread(tt,"Ram");
        t1.start();
        t2.start();
        t3.start();
    }
}
