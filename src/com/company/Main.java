package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Person> workerList = new ArrayList<>();
        workerList.add(new Administration("Claus","221175-1011",37,24000,5));
        workerList.add(new Instructor("Tove","011080-1014",20,456));
        workerList.add(new Administration("Anna","01180-1014",37,23000,5));
        workerList.add(new Instructor("Henning", "011080-1014",15,456));

        List <Person> memberList = new ArrayList<>();
        memberList.add(new Member("Morten","130195-1303",false));
        memberList.add(new Member("Martin","221175-1011",true));
        memberList.add(new Member("Martina","051970-1409",false));
        memberList.add(new Member("Marcal","221175-1011",true));


        // Lavede denne liste da jeg ikke kunne bruge .getName og cpr
        List <Person> fullList = new ArrayList<>();
        for (int i =0; i < workerList.size();i++) {
        fullList.add(new Person(workerList.get(i).getName(),workerList.get(i).getCpr())); }
        for (int j=0; j< memberList.size();j++) {
            fullList.add(new Person(memberList.get(j).getName(),memberList.get(j).getCpr()));
        }


    Member n = new Member();
    Employee m = new Employee();
    Person a = new Person();
    m.printOut(workerList);
    n.printOut(memberList);
    a.printOuts(fullList);
    }
}
