package com.company;

public class Member extends Person {

    private boolean isBasic;


    public String getMemberType() {
        if (isBasic)
            return "Basic";
        else {

            return "full";
        }
    }

    public int monthlyFee() {
        if (isBasic)
            return 199;
        else {
            return 299;
        }

    }

}
