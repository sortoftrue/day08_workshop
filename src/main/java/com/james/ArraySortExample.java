package com.james;

import java.util.Arrays;
import java.util.Collections;

public class ArraySortExample {
 
    public static void example(){

        String[] name = {"james","alex","richard","daryl","elaine","brandon","chris","marcus","joanne"};

        System.out.println("Unorted Array" + Arrays.toString(name));

        Arrays.sort(name);

        System.out.println("Sorted Array" + Arrays.toString(name));

        Arrays.sort(name,Collections.reverseOrder());

        System.out.println("Sorted Array" + Arrays.toString(name));

        Integer[] numbers = {1,5,2,5,6,2,3,4};

        Arrays.sort(numbers, Collections.reverseOrder());

        System.out.println(Arrays.toString(numbers));
    }

}
