public class SwitchCase_Month {

    public static void main (String[] arg){

        int month;

        for (month=0; month<12; month++) {


            switch (month) {

                case 12:
                case 2:
                case 1:
                    System.out.println("This is winter");
                    break;

                case 3:
                case 4:
                case 5:
                    System.out.println("This is Spring");
                    break;

                case 6:
                case 7:
                case 8:
                    System.out.println("This is Summer");
                    break;

                case 9:
                case 10:
                case 11:
                    System.out.println("This is Autumn");
                    break;


                default:
                    System.out.println("No Matching");

            }

        }

    } //main
}//class
