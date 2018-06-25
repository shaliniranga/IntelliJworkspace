public class Arrays {

    public static void main(String[] args){

        /*int a[] = new int[10]; //a is an one dimensional array of 10 integers

        for (int i = 0; i<10; i++){

            a[i]=i*2;

            System.out.println("The A array elements are " +a[i]);

        }

        int b[] = {4,5,2,7,9,1,13,57,89,78};//Array intializer

        for (int i = 0; i<10; i++){

            System.out.println("The B array elements are " +b[i]);
        }


        //add a alias

        int c[],d[];
        c=a;
        d=b;
        for (int i = 0; i<10; i++) {
            System.out.println("The c array elements are " +c[i]);
        }
        for (int i = 0; i<10; i++) {
            System.out.println("The d array elements are " +d[i]);
        }
*/
//Two dimension array

       /* int ar[][]= {{1,2,4,5},{5,6,8,9},{7,2,3,1}};

        for(int i=0;i<3;i++)

        {//for rows

            for(int j=0; j<4;j++){//for columns

                System.out.println(ar[i][j] + " ");
            }

            System.out.println("\n");
        }
*/
        // conventional array creation  int ar[][] = new int [3][4]

        int ar1[][] = new int[3][4];

        for(int i = 0; i<3; i++){

            for(int j=0;j<4;j++) {

                ar1[i][j] = i*j; //exercise 46  ar1[i][j]=1
                                // 46(b) if i =j ; ar1[i][j] =0

                System.out.println(ar1[i][j]);
            }

        }

    }
}

