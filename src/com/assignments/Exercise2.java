package com.assignments;

public class Exercise2 {

    public static void main (String[] args) {

        //int a = 10, b = 20, Sum, Diff, Rem;

        double a = 10.22, b = 20.34, Sum, Diff, Rem;


        System.out.println("Value of a is " + a);
        System.out.println("Value of a is " + b);

        Sum = a + b;
        Diff = Sum - b;
        Rem = b/Diff;

        System.out.println("Sum of two number is " +Sum);

        System.out.println("Difference of two numbers is " +Diff);

        System.out.println("Remainder of two numbers is " +Rem);
    }
}
