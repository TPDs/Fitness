package com.company;


import java.util.List;

public class Member extends Person {

    private boolean isBasic;

    public void printOut(List memberList){

        System.out.println("\nFITNESS MEMBERS \n \n" +
                "Name \t Cpr \t Member Type \t Fee");
        for (int i =0; i < 45;){
            System.out.print("*");
            i++;
        }
        System.out.println("");
        for (Object s : memberList) {
            System.out.println(s);
        }

        for (int i =0; i < 45;){
            System.out.print("=");
            i++;
        }

    }

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

    public Member() {
    }

    public Member(String name, String cpr, boolean isBasic) {
        super(name, cpr);
        this.isBasic = isBasic;
    }

    @Override
    public String toString() {
        return name + "\t " + cpr + "\t" + getMemberType() + "\t" + monthlyFee();
    }
}
