package com.assignments;

public class Exercise17 {

    public static void main(String[] args){

        int month;

        for(month=0;month<12;month++){

            switch(month){

                case 1:
                    System.out.println("This is january");
                case 2:
                    System.out.println("This is february");
                case 3:
                    System.out.println("This is march");
                case 4:
                    System.out.println("This is april");

                case 5:
                    System.out.println("This is may");
                case 6:
                    System.out.println("This is june");
                case 7:
                    System.out.println("This is july");
                case 8:
                    System.out.println("This is august");
                case 9:
                    System.out.println("This is september");
                case 10:
                    System.out.println("This is october");
                case 11:
                    System.out.println("This is november");
                case 12:
                    System.out.println("This is december");

                default:
                    System.out.println("Not any month");
            }
        }
    }
}
