package com.assignments;
import java.io.*;

public class OutOfBoundArray {

    public static void main(String args[]) {

        try {

            int a[] = new int[2];

            System.out.println("Access element " +a[3]);

        } catch (ArrayIndexOutOfBoundsException e) {

            System.out.println("Exception thrown: " +e);
        }
    }


}
