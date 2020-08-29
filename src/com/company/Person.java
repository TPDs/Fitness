package com.company;

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
}
