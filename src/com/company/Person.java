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

    public String getName() {
        return name;
    }

    public String getCpr() {
        return cpr;
    }

    // Printer for meget , men getName virker pt ikke
    public void printOuts(List fullList) {

        System.out.println("\nFITNESS EMPLOYEES & MEMBERS \n \n" +
                "Name \t Cpr \t ");
        for (int i = 0; i < 45; ) {
            System.out.print("*");
            i++;
        }
        System.out.println("");

        for (Object s : fullList) {
            System.out.println(s);
        }


        for (int i = 0; i < 45; ) {
            System.out.print("=");
            i++;
        }

    }

    @Override
    public String toString() {
        return name + "\t \t" + cpr;
    }


}
