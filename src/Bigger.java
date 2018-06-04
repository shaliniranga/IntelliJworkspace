public class Bigger {

    public static void main(String[] args) {

        int a = 25, b = 20, c = 10, max, min =0;

       /* if (a>b) {

            System.out.println("If statement executed" + a);

        }

        else
            System.out.println("Else statement executed " + b);
*/

 /*       if (a > b) {

            if (a > c) System.out.println(" a is biggest " + a);
        }

        else if (b > c) System.out.println("B is the biggest " + b);

                else System.out.println("C is the biggest " + c);

*/


     max = (a>b) ? a:b;

     max =  (max>c) ? max:c;

     System.out.println(" Print the max " +max);

     min = (b>a) ? a:b;
     min = (min>c) ? c:min;

     System.out.println("Print min " +min);

        } //main


    } // class



