package com.company;

import java.util.List;

public class Person {

protected String name;
protected String cpr;

    public Person(String name, String cpr) {
        this.name = name;
        this.cpr = cpr;
    }

    public Person() {
    }
// Printer for meget , men getName virker pt ikke
    public void printOut(List workerList, List memberList){

        System.out.println("\nFITNESS EMPLOYEES & MEMBERS \n \n" +
                "Name \t Cpr \t ");
        for (int i =0; i < 45;){
            System.out.print("*");
            i++;
        }
        System.out.println("");

        for (Object s : workerList) {
            System.out.println(s);
        }
        for (Object b : memberList) {
            System.out.println(b);
        }

        for (int i =0; i < 45;){
            System.out.print("=");
            i++;
        }

    }
    @Override
    public String toString() {
        return name + "\t \t" + cpr;
    }

    public String getName() {
        return name;
    }

    public String getCpr() {
        return cpr;
    }
}
