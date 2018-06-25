package com.assignments;

public class Exercise16 {

    public static void main(String args[]){

        int week;

        for (week=0; week<7;week++){

            switch(week){

                case 1:
                    System.out.println("This is Monday");
                case 2:
                    System.out.println("This is Tuesday");
                case 3:
                    System.out.println("This is Wednesday");
                case 4:
                    System.out.println("This is Thursday");
                case 5:
                    System.out.println("This is Friday");
                case 6:
                    System.out.println("This is Saturday");
                case 7:
                    System.out.println("This is Sunday");

                default:
                    System.out.println("Not Matching");
            }

        }

    }
}
