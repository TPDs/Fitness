package com.company;

import java.util.Arrays;

public class IntOnlyArrayList {
    int[] intlist = {0, 1, 2, 3};

    public void remove(int tal) {
        System.out.println(Arrays.toString(intlist));
        int count = intlist.length;
        int[] nyintList = new int[count - 1];

        for (int i = 0, j = 0; i < intlist.length; i++) {
            if (intlist[i] == tal) {
                continue;
            }
            nyintList[j++] = intlist[i];
        }
        intlist = nyintList;
        System.out.println(Arrays.toString(intlist));
    }

    public void add(int tal) {
        int count = intlist.length;
        int[] nyintList = new int[count + 1];

        for (int i = 0; i < count; i++) {

            nyintList[i] = intlist[i];

        }
        nyintList[count] = tal;
        intlist = nyintList;
        System.out.println(intlist.length);
    }
    public void clear() throws ArrayIndexOutOfBoundsException {
        intlist = null;
        int[] intlist = {0, 1}; //test
        System.out.println(intlist.length);

    }
    public void size() {
        System.out.println(intlist.length);

    }
}
