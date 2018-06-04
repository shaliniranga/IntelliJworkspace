public class ForCondition {
    public static void main (String[] arg){

     /*   int i;

       for (i=0; i<10 ; i++) {

            System.out.println("Print pass " +i);
        }
*/

 /*     int m,n;

      for (m=1,n=4; m<n ; m++,n--) {

          System.out.println(" The value on m is "  +m +  "The value on n is " +n);
      }

 */

 /* //Condition driven for loop

        int m = 0;

        boolean done = false;

        for (;!done;) {

            System.out.println(" The value of m " +m);

            if (m==10) done=true;

            m++;


        }
*/

/* //Implementatation of the above using while loop

        int i = 0;

        while (i<10){

            System.out.println("Pass " + i++);

        }

*/

//Implementation of the above using do-while

/*       int i=0;

        do {

            System.out.println("Pass " + i++);
        } while (i<5);

 */


// Implementation of Break

        boolean t = true;

        first : {
            second : {

                third : {
                     System.out.println("We are in thrid block");
                     if(t) break third;
                     System.out.println("Never print this");
                }

                System.out.println("Out of third");
            }

                System.out.println("Out of second");
            }

                System.out.println("Out of  first");

    }// main
}// class
