package com.assignments;

public class Pallindrome {

    public static void main (String args[]){

        int i = 1881, temp, sum=0,r;

        temp =i;

        while (i > 0){

            r = i % 10;

            sum = (sum * 10) + r;

            i = i/10;


            if (temp==sum) {

                System.out.println("This is a pallindrome number " +sum);
            } else {

                System.out.println("This is not a pallindrome number");
            }

        }


    }
}
