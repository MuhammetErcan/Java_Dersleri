package gun19;

import java.util.Arrays;
import java.util.Scanner;

public class _05_Methods {
    public static void main(String[] args) {

        /*
        kullanıcıdan aralarınad boşluk bırakarak 5 tam sayı girmesini isteyin
        busayılardan en büyük ve en küçüğü  bulan iki farklı metot yazın
         */
        int [] sayilar= new int[5];

        istenen(sayilar);

    }
    private static void istenen(int[]array) {
        Scanner scanner = new Scanner(System.in);
        int enk=0;
        int enb=0;

        for (int i = 0; i < array.length; i++) {
            array[i]=scanner.nextInt();
            Arrays.sort(array);

            enk = array[0];
            enb = array[array.length-1];
        }

        System.out.println("en küçük " + enk);
        System.out.println("en büyük " + enb);
    }
}
