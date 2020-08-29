package com.company;

public class Instructor extends Employee {

    @Override
    public String toString() {
        return name + "\t" + cpr + "\t" + getHours()+ "\t" + getSalary() ;
    }

    public Instructor(String name, String cpr, int hours, int salary) {
        super(name, cpr, hours, salary);
    }

    @Override
    public int getSalary() {
        return super.getSalary() * super.getHours();
    }
}
