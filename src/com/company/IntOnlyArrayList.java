package com.company;

public class IntOnlyArrayList {
    int[] intlist = {0, 1, 2, 3};


    public void remove (int tal) {
        System.out.println(intlist.length);
        int count = intlist.length;
        int[] nyintList = new int[count-1];

        for (int i = 0; i < count;i++) {
            if (intlist[count-i] == tal) {

            }
            else nyintList[count-i] = intlist[count-i];
        }

        intlist=nyintList;
        System.out.println(intlist.length);


    }


    public void add(int tal) {
        int count = intlist.length;
        int[] nyintList = new int[count + 1];

        for (int i = 0; i < count;i++ ) {

            nyintList[i] = intlist[i];

        }
        nyintList[count] = tal;
        intlist = nyintList;
        System.out.println(intlist.length);
    }

    public void clear() throws  ArrayIndexOutOfBoundsException{
        intlist = null;
        int[] intlist = {0, 1}; //test
        System.out.println(intlist.length);

    }

    public void size(){
        System.out.println(intlist.length);

    }
}
