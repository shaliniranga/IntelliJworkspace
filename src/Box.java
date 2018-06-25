public class Box {

    double length,breadth,width;

   //Parameterized Construction
   /* Box(double a, double b, double c){

        length = a;
        breadth = b;
        width = c;
    }
*/

   //Usage of this keyword.


    Box (double length, double breadth,double width){

        this.length = length;
        this.breadth = breadth;
        this.width= width;
    }

    double vol(){

        return length * breadth * width;
    }

    public static void main(String[] args){

        Box b1 = new Box(20,30,25);
        Box b2 = new Box(10,20,7);
        double vol1,vol2;

        vol1=b1.vol();
        vol2=b2.vol();

        System.out.println(" The volume of boxes b1 and b2 are " +vol1 + " "+ "and" + " " + +vol2);

    }
}
