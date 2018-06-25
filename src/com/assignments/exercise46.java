package com.assignments;

public class exercise46 {

    public static void main(String[] args) {

        int ar1[][] = new int[5][5];

        for (int i = 0; i < 5; i++) {

            for (int j = 0; j < 5; j++) {

                //exercise 46  ar1[i][j]=1
                // ar1[i][j] = 1;


                // 46(b) if i =j ; ar1[i][j] =0

                if ((i == j) || (i==4-j)) {

                    ar1[i][j] = 0;

                    System.out.println("diagonal " + ar1[i][j]);


                } else ar1[i][j] = 1;
            }
        }
    }
}

