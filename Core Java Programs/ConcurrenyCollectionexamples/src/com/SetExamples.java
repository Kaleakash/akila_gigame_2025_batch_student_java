package com;

import java.util.HashSet;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;

public class SetExamples {
    public static void main(String[] args) {
        // HashSet<Integer> set = new HashSet<>();
        //CopyOnWriteArraySet<Object> set = new CopyOnWriteArraySet<>();       // HashSet
        ConcurrentSkipListSet<Integer> set = new ConcurrentSkipListSet<>();  //TreeSet :Asc
        set.add(1);
        set.add(2);
        set.add(4);
        set.add(3);
        set.add(3);
        //set.add("A");
        for(Object i : set){
            set.add(100);
        }
        System.out.println(set);
    }
}
