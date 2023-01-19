package com.james;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class test {

    public static void main(String[] args) {
        File file = new File("./data/test.txt");

        BufferedWriter bw;



        try {
            bw = new BufferedWriter(new FileWriter(file));

            String input = new Scanner(System.in).next();

            bw.write("test");
            bw.flush();
        } catch (Exception e) {

        };

        
    }

}
