import java.util.*;

public class Scannerclass {

    public static void main(String arg[]){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a name ;");
        String name = sc.next();

        System.out.println("Enter an id no:");
        int id = sc.nextInt();

        System.out.println("Enter Salary");
        double salary = sc.nextDouble();

        System.out.println(name+" "+"Has an id" +id + "and a salary" +salary);
    }
}
