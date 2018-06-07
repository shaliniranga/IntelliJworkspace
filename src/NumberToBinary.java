public class NumberToBinary {

    public static void main(String[] args){

        int num=14,rem=0,binary=0,i=1;

        while (num!=0){

            rem=num%2;
            binary = binary+rem*i;
            i*=10;
            num/=2;
        }

        System.out.println("Print Binary " +binary);
    }
}
