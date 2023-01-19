package com.james;

import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {
    
    public static void example(){
        List<String> ll = new LinkedList<>();

        String[] letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".split("");
        
        for(String letter:letters){
            ll.add(letter);
        }

        System.out.println(ll);

        ((LinkedList)ll).removeFirst();

        System.out.println(ll);

    }


}
