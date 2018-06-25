import java.io.*;

public class ExceptionHandling {

    public static void main(String args[]) throws IOException {

        int d,a;

        try {

            d=0;
            a = 42/d;

            System.out.println("This line is not printed");


        } catch(ArithmeticException e) {

            System.out.println(" Error - division by zero");


        }

        System.out.println("After catch block");

    }
}
