package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)  {


        IntOnlyArrayList cola = new IntOnlyArrayList();

        //cola.size();
        //cola.add(8);
        //cola.add(9);
        //cola.clear();
        cola.remove(12);

        List<Person> workerList = new ArrayList<>();
        workerList.add(new Administration("Claus", "221175-1011", 37, 23000, 5));
        workerList.add(new Instructor("Tove", "011080-1014", 20, 456));
        workerList.add(new Administration("Anna", "01180-1014", 37, 23000, 5));
        workerList.add(new Instructor("Henning", "011080-1014", 15, 456));

        List<Person> memberList = new ArrayList<>();
        memberList.add(new Member("Morten", "130195-1303", false));
        memberList.add(new Member("Martin", "221175-1011", true));
        memberList.add(new Member("Martina", "051970-1409", false));
        memberList.add(new Member("Marcal", "221175-1011", true));

         List<Person> fullList = new ArrayList<>();
        for (int i = 0; i < workerList.size(); i++) {
            fullList.add(new Person(workerList.get(i).getName(), workerList.get(i).getCpr()));
        }
        for (int j = 0; j < memberList.size(); j++) {
            fullList.add(new Person(memberList.get(j).getName(), memberList.get(j).getCpr()));
        }

        List<Person> fullListFraRead = new ArrayList<>();
        try {
            Scanner sc = new Scanner(new File("src//resource//persons.txt"));
            while (sc.hasNextLine()) {
                fullListFraRead.add(new Person(sc.next(), sc.next()));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();

        }
/*
        Member n = new Member();
        Employee m = new Employee();
        Person a = new Person();
        m.printOut(workerList);
        n.printOut(memberList);
        a.printOuts(fullList);
        a.printOuts(fullListFraRead);

        */





    }
}
