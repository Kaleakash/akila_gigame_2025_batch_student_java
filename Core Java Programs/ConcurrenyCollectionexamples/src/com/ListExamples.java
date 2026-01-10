package com;

import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;

public class ListExamples {
    public static void main(String[] args) {
        //ArrayList<String> config = new ArrayList<String>();       // old collection
        CopyOnWriteArrayList<String> config = new CopyOnWriteArrayList<>(); // new collection
        config.add("URL");
        config.add("PORT");     // write operation
        config.add("PROTOCOL");     // write operation
        for(String s: config){      // read and write
            config.add("timeout");
            //System.out.println(s);
        }
        System.out.println(config.toString());
    }
}
