package com.james;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        System.out.println("Hello World!");

        ArraySortExample.example();

        CollectionsSortExample.example();

        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(223,"james","abc","coder",423423));
        employees.add(new Employee(223,"richard","abc","coder",423423));
        employees.add(new Employee(223,"alex","xyz","coder",423423));
        employees.add(new Employee(223,"jim","xyz","coder",7000));
        employees.add(new Employee(223,"daryl","abc","coder",423423));
        employees.add(new Employee(111,"james","abc","coder",423423));
        employees.add(new Employee(114,"james","abc","coder",423423));
        employees.add(new Employee(124,"james","abc","coder",423423));
        employees.add(new Employee(223,"james","abc","coder",423423));

        System.out.println(employees);

        List<Employee> filteredEmp = employees.stream().filter(e->e.getFullName().equalsIgnoreCase("james")).collect(Collectors.toList());

        System.out.println(filteredEmp);

        employees.sort(null);

        System.out.println(employees);

        employees.sort(Comparator.reverseOrder());

        System.out.println(employees);

        employees.sort(Comparator.comparing(Employee::getFullName));

        System.out.println(employees);

        HashMapExample.example();

        LinkedListExample.example();

        StackExample.example();
    }
}
