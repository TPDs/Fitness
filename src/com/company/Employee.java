package com.company;

import java.util.ArrayList;
import java.util.List;

public class Employee extends Person {

    private int hours, salary;
    //ArrayList workerList;



    public void printOut(){
        List<Employee> workerList = new ArrayList<>();
        workerList.add(new Administration("Claus","221175-1011",37,24000,5));
        workerList.add(new Instructor("Tove","011080-1014",20,456));
        workerList.add(new Administration("Anna","01180-1014",37,23000,5));
        workerList.add(new Instructor("Henning", "011080-1014",15,456));
        System.out.println("FITNESS EMPLOYEES \n \n" +
                "Name \t Cpr \t Hours \t Salary \t Vacation");
        for (int i =0; i < 45;){
            System.out.print("*");
            i++;
        }
        System.out.println("");
        for (Employee s : workerList) {
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
