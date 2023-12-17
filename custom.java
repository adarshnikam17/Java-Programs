package com.company;

class Employee{
    int id;
    int salary;
    String name;
    public void printDetails(){
        System.out.println("My id is " + id);
        System.out.println("and my name is "+ name);


    }
    public int getSalary(){
        return salary;
    }
}
public class custom {
    public static void main(String[] args){
        Employee adarsh= new Employee();
        Employee yash= new Employee();

        adarsh.id=18;
        adarsh.salary=10000;
        adarsh.name="Adarsh Nikam";

        yash.id=7;
        yash.salary=50000;
        yash.name="Yash Nikam";

        adarsh.printDetails();
        yash.printDetails();
        int salary=yash.getSalary();
        System.out.println(salary);
    }
}
