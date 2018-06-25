public class Overload {

    void test() {
        System.out.println("no parameters");

    }

    void test1(int a) {
        System.out.println("Single parameter" + a);

    }

    void test2(int a, int b) {

        System.out.println("Parameters" + a + " , " + +b);
    }

    double test(double a) {

        System.out.println("Double a " +a);

        return a*a;
    }


    public static void main(String[] Args){

        double result;

        Overload a = new Overload();

        result = a.test(30.00);

        System.out.println("Result is " +result);

        a.test();
        a.test1(5);
        a.test2(2,5);
        a.test(20);
    }

}