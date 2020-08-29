package com.company;

import java.util.ArrayList;
import java.util.List;

public class Employee extends Person {

    private int hours, salary;

    public void printOut(List workerList){

        System.out.println("\nFITNESS EMPLOYEES \n \n" +
                "Name \t Cpr \t Hours \t Salary \t Vacation");
        for (int i =0; i < 45;){
            System.out.print("*");
            i++;
        }
        System.out.println("");
        for (Object s : workerList) {
            System.out.println(s);
        }

        for (int i =0; i < 45;){
            System.out.print("=");
            i++;
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
