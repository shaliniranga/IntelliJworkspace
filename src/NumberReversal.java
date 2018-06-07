public class NumberReversal {

    public static void main(String[] args) {

        int a=1384,b=0,c=0;

        while (a!=0){

            b=a%10;

            c=c*10+b;

            a=a/10;

            System.out.println( "The value of b is " +b + "The value of c is " +c + "The value of a is " +a );
        }

    }//main
}//class
