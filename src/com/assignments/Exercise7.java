package com.assignments;

public class Exercise7 {

    public static void main (String[] args){

        int a = 20, b = 10, c = 30,min, max;

        max = a>b ? a:b;
        max = max>c ? max:c;

        System.out.println(" The maximum value is " +max);
    }
}
