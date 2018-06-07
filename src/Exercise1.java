public class Exercise1 {

    public static void main(String[] args){

        int a,b,a1=0,b1=0,max=0, product=0,prod1=0;

        for(a=1,b=47; a<b; a++,b--) {

            product=a*b;

            if (product>max) {

                a1=a;
                b1=b;
                prod1=product;

            }

            System.out.println(" The value on a is "  +a +   "The value on b is " +b + "The product is  " +product);

        }

        System.out.println("Print the value of a1 " +a1 + "Print the value of b1 " +b1 + "The maximum product is  " +prod1);

    }//main
}// class
