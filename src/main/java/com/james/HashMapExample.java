package com.james;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    
    public static void example(){
        Map<String, Integer> phones = new HashMap<>();

        phones.put("iphone", 500);
        phones.put("Huawei",400);
        phones.put("xiaomi", 200);
        phones.put("samsung", 150);

        System.out.println("total "+phones.size());

        for(String key:phones.keySet()){
            System.out.println(key + phones.get(key));
        }

        phones.forEach((a,b)->System.out.println(a +" "+ b));

        phones.forEach((a,b)->{
            if(b >200){
                System.out.println(a);
            }
        });



    }

}
