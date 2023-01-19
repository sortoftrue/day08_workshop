package com.james;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsSortExample {
    
    public static void example(){

        List<Integer> numbers = new ArrayList<>();

        for(int i=0;i<10;i++){
            numbers.add((int)(Math.random()*100));
        }

        System.out.println("Unsorted" + numbers);

        Collections.sort(numbers);

        System.out.println("Sorted" + numbers);

        numbers.sort(Collections.reverseOrder());

        System.out.println("Reverse" + numbers);

        numbers.sort(null);

        System.out.println("Sorted" + numbers);
    }

}
