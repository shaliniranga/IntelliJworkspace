public class ArrayLength {

    public static void main(String[] args){

        int a[] ={1,2,3,4,5};
        int b[]= {6,7,8};


        int alen = a.length;
        int blen = b.length;
        int clen= alen+blen;

        //empty array
        int[] c = new int[clen];

        int j,k;

        for(j=0; j<alen; j++){

            c[j] = a[j];

            System.out.println(" Printing value of a in c " +c[j]);

        }

        for (k=0; j<clen; j++,k++){

            c[j] = b[k];

            System.out.println(" Printing value of b in c " +c[j]);
        }
    }


}
