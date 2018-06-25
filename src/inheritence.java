
public class inheritence {

    public static void main (String args[]){


        A ob_sup = new A();
        B ob_sub = new B();

        ob_sup.i=2;
        ob_sup.j=3;
        ob_sup.showij();

        ob_sub.i =4;
        ob_sub.j=5;
        ob_sub.k =6;
        ob_sub.showk();


    }

}

class A {

    int i, j;

    void showij() {

        System.out.println("Printing from parent class " + "Super-i = " + i +" " + "Super -j = " + j);

    }
}
    class B extends A {

        int k;

        void showk(){

            System.out.println("The value of K is " +k);
            System.out.println("The values if i and j are " +i + " " +j);
        }

    }

