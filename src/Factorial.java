public class Factorial {

    public static void main (String[] args){

        int fact=1,num=7;

         while (num!=0){

             fact = fact * num--;

         }

         System.out.println("Print fact " +fact);
    }
}
