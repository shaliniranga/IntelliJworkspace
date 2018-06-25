package com.assignments;

public class Exercise14 {

    public static void main (String[] args){

        int a = 60,b=60,c=60,d=90,e=45,f=45;

        if (a==b && b==c) {

            System.out.println("This an equilateral triangle with sides " +a + " "  + +b + " " + +c);

            if(d==e+f && d==90){

                System.out.println(" This is a right angle with sides " +d + " "  + +e + " " + +f);

            }
        } else  {

            System.out.println(" This is else block");
        }


    }
}
