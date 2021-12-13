package gun20HaftaSonuOdev;

import java.util.Scanner;

public class _soru7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*
        Bir dizinin en büyük ve en küçük öğelerini bulun.
         */

        int [] array ={30,34,65,98,78,12,35,56,510,12};
        int enb=0;
        int enk=array[0];

        for (int i = 0; i < array.length; i++) {

            if (array[i]>enb)
                enb=array[i];
            if (array[i]<enk)
                enk=array[i];
        }
        System.out.println("enb = " + enb);
        System.out.println("enk = " + enk);

    }
}