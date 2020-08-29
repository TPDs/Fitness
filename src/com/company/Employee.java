package com.company;

import java.util.ArrayList;
import java.util.List;

public class Employee extends Person {

    private int hours, salary;
    ArrayList workerList;

public void createList() {
    List<Employee> workerList = new ArrayList<>();
    workerList.add(new Administration("Claus","221175-1011",37,23000,5));
    workerList.add(new Instructor("Tove","011080-1014",20,155));
}


    public void printOut(){
        createList();
        System.out.println("FITNESS EMPLOYEES \n \n" +
                "Name \t Cpr \t Hours \t Salary \t Vacation");
        for (int i =0; i < 23;){
            System.out.println("*");
            i++;
        }
        for (Employee s : workerList) {
            System.out.println(s);
        }

    }

    public Employee() {
    }

    public Employee(String name, String cpr,int hours, int salary ) {
        super(name,cpr);
        this.hours= hours;
        this.salary=salary;
    }

    public int getHours() {
        return hours;
    }

    public int getSalary() {
        return salary;
    }
}
