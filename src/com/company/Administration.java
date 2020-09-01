package com.company;

public class Administration extends Employee {


    private int vacation;

    public void setVacation(int vacation) {
        this.vacation = vacation;
    }

    public int getVacation() {
        return vacation;
    }

    public Administration(String name,String cpr, int hours, int salary, int vacation) {
        super(name,cpr,hours,salary);
        //hours = 37;
       // salary = 24000;
        this.vacation = vacation;
    }

    @Override
    public String toString() {
        return name + "\t" + cpr + "\t" + getHours() + "\t" + getSalary() + "\t \t \t" + getVacation();
    }
}
