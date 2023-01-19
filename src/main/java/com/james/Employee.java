package com.james;

public class Employee implements Comparable<Employee>{
    
    private Integer staffNo;
    private String fullName;
    private String department;
    private String role;
    private String emailAddress;
    private Integer salary;

    
    public Integer getStaffNo() {
        return staffNo;
    }


    public String getFullName() {
        return fullName;
    }


    public String getDepartment() {
        return department;
    }


    public String getRole() {
        return role;
    }


    public String getEmailAddress() {
        return emailAddress;
    }


    public Integer getSalary() {
        return salary;
    }


    @Override
    public String toString() {
        return "%d %s %s %s %s %d".formatted(staffNo, fullName, department,role,emailAddress,salary);
    }


    public Employee(Integer staffNo, String fullName, String department, String role, Integer salary) {
        this.staffNo = staffNo;
        this.fullName = fullName;
        this.department = department;
        this.role = role;
        this.emailAddress = fullName+role+"@"+department+".com";
        this.salary = salary;
    }


    @Override
    public int compareTo(Employee a){

        if(this.staffNo.compareTo(a.staffNo)!=0){
            return this.staffNo.compareTo(a.staffNo);
        } else if(this.fullName.compareTo(a.fullName)!=0){
            return this.fullName.compareTo(a.fullName);
        } else if(this.department.compareTo(a.department)!=0){
            return this.department.compareTo(a.department);
        } else return this.salary.compareTo(a.salary);

    }

}
