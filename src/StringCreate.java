public class StringCreate {
    public  static void main(String args[]){

        String s1 = "abdcef";

        System.out.println(s1);


        char ch[] = {'a','b','c','d','e','f','g','h'};

        String s2 = new String(ch);

        String s3 = new String(ch,2,6);

        System.out.println("Print the strings " +s2 + " " +s3);


        byte asc [] = {65,66,67,68,69,70};

        String s4 = new String(asc);

        String ss4 = new String(asc,2,3);

        System.out.println("Printing the Strings " +s4 + " " +ss4);

    }
}
