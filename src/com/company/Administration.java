package com.company;

public class Administration extends Employee {


    private int vacation;

    public void setVacation(int vacation) {
        this.vacation = vacation;
    }

    public int getVacation() {
        return vacation;
    }

    public Administration(String name,String cpr, int hours, int vacation, int salary) {
        super(name,cpr,hours,salary);
        hours = 37;
        salary = 24000;
        this.vacation = vacation;
    }
}
