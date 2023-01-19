package com.james;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileReaderMain {
    
    public static void main(String[] args) throws Exception{
        
        File file = new File("./data/data.txt");

        if(file.isFile()) System.out.println("file found!");

        BufferedReader reader;
        //BufferedWriter writer;

        
        //writer = new BufferedWriter(new FileWriter(file,true));
        FileWriter writer = new FileWriter(file,true);

        Scanner scan = new Scanner(System.in);
        List<Employee> employees = new ArrayList<>();

        String choice ="";
        
        while (!choice.equals("exit")){
            System.out.println("add,save,read,exit");
            choice = scan.next();
            switch(choice){
                case "add":{
                    Integer staffNo;
                    String fullName;
                    String department;
                    String role;
                    Integer salary;
                    
                    System.out.printf("Staff No (int)");
                    staffNo = Integer.parseInt(scan.next());
                    System.out.printf("Fullname");
                    fullName = scan.next();
                    System.out.printf("Department");
                    department = scan.next();
                    System.out.printf("Role");
                    role = scan.next();
                    System.out.printf("Salary (int)");
                    salary = Integer.parseInt(scan.next());

                    employees.add(new Employee(staffNo,fullName,department,role,salary));

                    System.out.println(employees);
                    break;
                }
                case "save":{
                    System.out.println("proceeding to save");
                    employees.forEach(e->{
                        try {
                            writer.write(e.toString()+"\n");
                            writer.flush();
                        } catch (IOException e1) {
                            // TODO Auto-generated catch block
                            e1.printStackTrace();
                        }
                    });
                    employees.clear();
                    break;
                }
                case "read":{
                    reader = new BufferedReader(new FileReader(file));
                    while(reader.ready()){
                        Scanner readEmp = new Scanner(reader.readLine());
                        
                        System.out.printf("Number: %-8s |Name: %-8s |Dept: %-10s |Role: %-10s |Email: %-10s |Salary: %-5s\n",readEmp.next(),readEmp.next(),readEmp.next(),readEmp.next(),readEmp.next(),readEmp.next());
                        
                    }

                    break;
                }
                case "exit":{
                    System.out.println("Bye");
                    break;
                }
                default:{
                    System.out.println("invalid!");
                    break;
                }
            }

        }
        
        

    }

}
