package com.james;

import java.util.Stack;

public class StackExample {
    
    public static void example(){
        Stack<Integer> stack = new Stack<>();

        for(int i=0;i<10;i++){
            stack.push(i);
            System.out.println(stack);
        }

        for(int i=0;i<10;i++){
            stack.pop();
            System.out.println(stack);
        }

    }

}
