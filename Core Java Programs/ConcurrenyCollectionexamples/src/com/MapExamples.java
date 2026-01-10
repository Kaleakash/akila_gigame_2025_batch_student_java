package com;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

class LoginTask implements Runnable {
    //static Map<Integer,String> session = new HashMap<>();
    static Map<Integer,String> session = new ConcurrentHashMap<>();
    int userId;
    LoginTask(int userId){
        this.userId = userId;
    }
    @Override
    public void run() {
        session.put(userId,"Active");
        System.out.println("User "+userId+" has been logged in");
    }
}
public class MapExamples {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            new Thread(new LoginTask(i)).start();
        }
    }
}
