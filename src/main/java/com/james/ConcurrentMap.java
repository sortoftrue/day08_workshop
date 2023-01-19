package com.james;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

import javax.swing.event.SwingPropertyChangeSupport;

public class ConcurrentMap {

    public static void main(String[] args) {
        
        Map<String, Integer> phones = new HashMap<>();

        phones.put("iphone", 500);
        phones.put("Huawei",400);
        phones.put("xiaomi", 200);
        phones.put("samsung", 150);

        System.out.println("total "+phones.size());

        for(int i=0;i<5;i++){
            
            Thread thread = new Thread(()->{
                while(true){
                    System.out.println(phones.get("iphone"));
                    System.out.println(Thread.currentThread().getName());
                }
            });
            thread.start();
        }

    }
    

    

}
